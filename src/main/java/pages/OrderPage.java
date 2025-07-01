package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class OrderPage {
    private final WebDriver driver;
    //поле Имя
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //поле Фамилия
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //поле Адрес
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле Станция метро
    private final By metroStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    //поле телефон
    private final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //кнопка Далее
    private final By nextButton = By.xpath(".//button[text()='Далее']");
    //поле Когда привезти
    private final By dateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //поле период
    private final By rentalPeriodField = By.className("Dropdown-root");
    //поле Цвет самоката
    private final By colorCheckboxBlack = By.id("black");
    private final By colorCheckboxGrey = By.id("grey");
    //поле Комментарий
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //кнопка Заказать
    private final By orderButton = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    //подтверждение заказа
    private final By confirmOrderButton = By.xpath(".//button[text()='Да']");
    //кнопка Да уже все привыкли
    public final By closeInformCookie = By.xpath(".//button[text()='да все привыкли']");
    //текст Заказ оформлен
    private final By successMessage = By.xpath(".//div[text()='Заказ оформлен']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillFirstPage(String name, String surname, String address, String metroStation, String phone) {
        //закрываю всплывающее окно про куки
        driver.findElement(closeInformCookie).click();
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(surnameField).sendKeys(surname);
        driver.findElement(addressField).sendKeys(address);
        driver.findElement(metroStationField).click();
        driver.findElement(By.xpath(".//div[text()='" + metroStation + "']")).click();
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(nextButton).click();
    }

    public void fillSecondPage(String date, String rentalPeriod, String color, String comment) {
        driver.findElement(dateField).sendKeys(date, Keys.ARROW_DOWN, Keys.ENTER);
        driver.findElement(rentalPeriodField).click();
        driver.findElement(By.xpath(".//div[text()='" + rentalPeriod + "']")).click();
        if (color.equals("black")) {
            driver.findElement(colorCheckboxBlack).click();
        } else if (color.equals("grey")) {
            driver.findElement(colorCheckboxGrey).click();
        } else {
            driver.findElement(colorCheckboxBlack).click();
            driver.findElement(colorCheckboxGrey).click();
        }
        driver.findElement(commentField).sendKeys(comment);
        driver.findElement(orderButton).click();
    }
    //клик кнопки далее
    public void confirmOrder() {
        driver.findElement(confirmOrderButton).click();
    }
    //для проверки что заказ оформлен
    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}