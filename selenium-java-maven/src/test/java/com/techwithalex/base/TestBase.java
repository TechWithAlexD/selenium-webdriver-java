package com.techwithalex.base;

import com.techwithalex.pages.WebFormPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeEach
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void afterTest(){
        driver.quit();
    }

    protected WebFormPage goToHomePage(){
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        return new WebFormPage(driver);
    }
}
