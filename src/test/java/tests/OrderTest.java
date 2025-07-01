package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;

import pages.OrderPage;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderTest {
    private WebDriver driver;
    private MainPage mainPage;
    private OrderPage orderPage;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        mainPage = new MainPage(driver);
    }

    @ParameterizedTest
    @CsvSource({
            "top, Иван, Иванов, Москва, Черкизовская, +79991234567, 10.10.2023, сутки, black, Позвоните за 10 минут",
            "bottom, Петр, Петров, Москва, Сокольники, +79997654321, 15.10.2023, двое суток, grey, Позвоните за 5 минут"
    })
    public void testOrderFlow(String buttonPosition, String name, String surname, String address,
                              String metroStation, String phone, String date,
                              String rentalPeriod, String color, String comment) {
        if (buttonPosition.equals("top")) {
            mainPage.clickOrderButtonTop();
        } else {
            mainPage.clickOrderButtonBottom();
        }
        orderPage = new OrderPage(driver);
        orderPage.fillFirstPage(name, surname, address, metroStation, phone);
        orderPage.fillSecondPage(date, rentalPeriod, color, comment);
        orderPage.confirmOrder();
        assertTrue(orderPage.isSuccessMessageDisplayed(), "Success message is not displayed");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
