package com.techwithalex.cucumber;

import com.techwithalex.pages.TargetPage;
import com.techwithalex.pages.WebFormPage;
import com.techwithalex.utils.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class MyStepDefinition {

    private WebDriver driver;
    private TargetPage targetPage;
    private WebFormPage webFormPage;

    public MyStepDefinition(){
        driver = WebDriverFactory.getDriver();
    }

    @Given("I have navigated to page {string}")
    public void iHaveNavigatedToPage(String url) {
        driver.get(url);
        webFormPage = new WebFormPage(driver);
    }

    @And("I have set {string} to text area")
    public void iHaveSetToTextArea(String text) {
        webFormPage.writeTextToTextArea(text);
    }

    @When("I submit the form")
    public void iSubmitTheForm() {
        targetPage = webFormPage.submitForm();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        String actualMessage = targetPage.getMessage();
        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
