package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FAQPage;
import utils.Constant;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class FAQTest {
    private WebDriver driver;
    private FAQPage faqPage;


    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();

        faqPage = new FAQPage(driver);
        driver.get(Constant.BASE_URL);
    }

    @ParameterizedTest
    @CsvSource({
            "question1, actual1, 'Сутки — 400 рублей. Оплата курьеру — наличными или картой.'",
            "question2, actual2, 'Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.'",
            "question3, actual3, 'Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.'",
            "question4, actual4, 'Только начиная с завтрашнего дня. Но скоро станем расторопнее.'",
            "question5, actual5, 'Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.'",
            "question6, actual6, 'Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.'",
            "question7, actual7, 'Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.'",
            "question8, actual8, 'Да, обязательно. Всем самокатов! И Москве, и Московской области.'"
    })
    public void testFaqAccordionItem(String questionLocatorName, String actualLocatorName, String expectedText) throws InterruptedException {
        By questionLocator = faqPage.getLocatorByName(questionLocatorName);
        By actualLocator = faqPage.getLocatorByName(actualLocatorName);
        // Прокрутка
        WebElement element = driver.findElement(questionLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        // Раскрыть вопрос
        driver.findElement(questionLocator).click();
        //Ожидаем появления ответа
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(actualLocator));
        //Получаем текст ответа
        String actualText = driver.findElement(actualLocator).getText();
        //Проверяем что текст ответа равен тому, что ожидаем
        assertEquals(expectedText, actualText, "Ошибка: текст не совпадает");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}