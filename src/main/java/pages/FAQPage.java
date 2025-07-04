package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Field;

public class FAQPage {
    private final WebDriver driver;
    // первый вопрос
    public By question1 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-0\"]");

    //первый ответ
    public By actual1 = By.xpath("//*[@id=\"accordion__panel-0\"]/p");

    //второй вопрос
    public By question2 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-1\"]");
    //второй ответ
    public By actual2 = By.xpath(".//div[@id=\"accordion__panel-1\"]//p");
    //третий вопрос
    public By question3 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-2\"]");
    //третий ответ
    public By actual3 = By.xpath(".//div[@id=\"accordion__panel-2\"]//p");
    //четвертый вопрос
    public By question4 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-3\"]");
    //четвертый ответ
    public By actual4 = By.xpath(".//div[@id=\"accordion__panel-3\"]//p");
    //пятый вопрос
    public By question5 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-4\"]");
    //пятый ответ
    public By actual5 = By.xpath(".//div[@id=\"accordion__panel-4\"]//p");
    //шестой вопрос
    public By question6 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-5\"]");
    //шестой ответ
    public By actual6 = By.xpath(".//div[@id=\"accordion__panel-5\"]//p");
    //седьмой вопрос
    public By question7 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-6\"]");
    //седьмой ответ
    public By actual7 = By.xpath(".//div[@id=\"accordion__panel-6\"]//p");
    //восьмой вопрос
    public By question8 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-7\"]");
    //восьмой ответ
    public By actual8 = By.xpath(".//div[@id=\"accordion__panel-7\"]//p");

    public By getLocatorByName(String name) {
        try {
            Field field = this.getClass().getDeclaredField(name);
            return (By) field.get(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Локатор не найден: " + name, e);
        }
    }

    public FAQPage(WebDriver driver) {
        this.driver = driver;
    }
}