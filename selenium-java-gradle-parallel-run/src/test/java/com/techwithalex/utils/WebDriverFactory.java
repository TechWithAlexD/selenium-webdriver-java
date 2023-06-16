package com.techwithalex.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    public static synchronized WebDriver getDriver() {
        WebDriver driver = webDriverThreadLocal.get();

        if (driver == null) {
            driver = new ChromeDriver();

            System.out.println("Creating driver instance on thread: " + Thread.currentThread().threadId());

            webDriverThreadLocal.set(driver);
        }

        return driver;
    }

    public static synchronized void quitDriver() {
        WebDriver driver = webDriverThreadLocal.get();

        if (driver != null) {
            driver.quit();
            webDriverThreadLocal.remove();
        }
    }

}
