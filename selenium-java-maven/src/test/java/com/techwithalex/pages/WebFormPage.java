package com.techwithalex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebFormPage {
    WebDriver driver;

    By textArea = By.name("my-textarea");
    By submitButton = By.tagName("button");

    public WebFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebFormPage writeTextToTextArea(String text) {
        driver.findElement(textArea).sendKeys(text);

        return this;
    }

    public TargetPage submitForm() {
        driver.findElement(submitButton).click();

        return new TargetPage(driver);
    }
}
