package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FAQPage {
    private final WebDriver driver;
    // первый вопрос
    public By question1 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-0\"]");

    //первый ответ
    public By actual1 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p");

    //второй вопрос
    public By question2 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-1\"]");
    //второй ответ
    public By actual2 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p");
    //третий вопрос
    public By question3 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-2\"]");
    //третий ответ
    public By actual3 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p");
    //четвертый вопрос
    public By question4 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-3\"]");
    //четвертый ответ
    public By actual4 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p");
    //пятый вопрос
    public By question5 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-4\"]");
    //пятый ответ
    public By actual5 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p");
    //шестой вопрос
    public By question6 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-5\"]");
    //шестой ответ
    public By actual6 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p");
    //седьмой вопрос
    public By question7 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-6\"]");
    //седьмой ответ
    public By actual7 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p");
    //восьмой вопрос
    public By question8 = By.xpath(".//div[@class='accordion__item']//div[@id=\"accordion__heading-7\"]");
    //восьмой ответ
    public By actual8 = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p");



    public FAQPage(WebDriver driver) {
        this.driver = driver;
    }
}