package Homework.hw_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWorkTest {
    WebDriver driver;

    //before-setUp
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");// without history
    }

    //tests
    @Test
    public void openGoogle() {
        System.out.println("The site is opened!");
    }


    //after-tearDown (закрываем браузер)
    @AfterMethod
    public void tearDown() {
        driver.quit();//all tabs close browser

    }
//    =============SECOND HW===============

    @Test
    public void findElementByCssSelector() {
        //tag name -> tag
        //WebElement element = driver.findElement(By.tagName("h1"));
        driver.findElement(By.cssSelector("div"));

        driver.findElement(By.cssSelector("link"));

        driver.findElement(By.cssSelector("a"));


        //id -> #id
        //driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#dialog-notifications-success"));

        driver.findElement(By.cssSelector("#dialog-notifications-error"));

        driver.findElement(By.cssSelector("#bar-notification"));

        driver.findElement(By.cssSelector("#USE_CHAT_GPT_AI_CONTENT_CSS_LINK_TAG"));

        driver.findElement(By.cssSelector("#flyout-cart"));



        //class -> class
        //WebElement phone =  driver.findElement(By.className("telephone"));
        driver.findElement(By.cssSelector(".header"));

        driver.findElement(By.cssSelector(".header-logo"));

        driver.findElement(By.cssSelector(".search-box"));

        driver.findElement(By.cssSelector(".header-links-wrapper"));

        driver.findElement(By.cssSelector(".footer"));

        driver.findElement(By.cssSelector(".master-wrapper-content"));


        //[attr='value']
        WebElement cssSelector = driver.findElement(By.cssSelector("[ng-reflect-name='city']"));
        System.out.println(cssSelector.getAttribute("type"));
       


    }

}
