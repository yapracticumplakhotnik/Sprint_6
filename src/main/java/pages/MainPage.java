package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {
    private final WebDriver driver;
    //кнопка заказать вверху
    private final By orderButtonTop = By.xpath(".//div[contains(@class, 'Header')]//button[text()='Заказать']");
    //кнопка заказать внизу
    private final By orderButtonBottom = By.xpath(".//div[contains(@class, 'FinishButton')]//button[text()='Заказать']");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrderButtonTop() {
        driver.findElement(orderButtonTop).click();
    }

    public void clickOrderButtonBottom() {
        WebElement element = driver.findElement(orderButtonBottom);
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }


}
