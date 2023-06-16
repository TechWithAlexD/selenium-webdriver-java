package com.techwithalex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TargetPage {
    WebDriver driver;

    By message = By.id("message");

    public TargetPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMessage() {
        return driver.findElement(message).getText();
    }
}
