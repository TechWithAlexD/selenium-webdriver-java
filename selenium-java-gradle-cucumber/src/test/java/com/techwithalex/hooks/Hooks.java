package com.techwithalex.hooks;

import com.techwithalex.utils.WebDriverFactory;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    @After
    public void AfterSteps(){
        WebDriverFactory.quitDriver();
    }
}
