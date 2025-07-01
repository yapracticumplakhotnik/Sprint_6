package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FAQPage;
import pages.OrderPage;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class FAQTest {
    private WebDriver driver;
    private FAQPage faqPage;



    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver = new FirefoxDriver();

        faqPage = new FAQPage(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testAccordionItem1() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question1));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question1).click();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = driver.findElement(faqPage.actual1).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }
    @Test
    public void testAccordionItem2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question2));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question2).click();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = driver.findElement(faqPage.actual2).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }
    @Test
    public void testAccordionItem3() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question3));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question3);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question3).click();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = driver.findElement(faqPage.actual3).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }
    @Test
    public void testAccordionItem4() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question4));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question4);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question4).click();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = driver.findElement(faqPage.actual4).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }
    @Test
    public void testAccordionItem5() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question5));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question5).click();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = driver.findElement(faqPage.actual5).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }
    @Test
    public void testAccordionItem6() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question6));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question6).click();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = driver.findElement(faqPage.actual6).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }
    @Test
    public void testAccordionItem7() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question7));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question7);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question7).click();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = driver.findElement(faqPage.actual7).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }
    @Test
    public void testAccordionItem8() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(faqPage.question8));
        //Прокрутка
        WebElement element = driver.findElement(faqPage.question8);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        // раскрыли вопрос
        driver.findElement(faqPage.question8).click();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = driver.findElement(faqPage.actual8).getText();
        assertEquals(expected, actual, "Ошибка текст не равен");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}