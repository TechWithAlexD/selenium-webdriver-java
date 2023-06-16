Feature: Selenium tests

  @regression
  Scenario Outline: Submit form with text area set
    Given I have navigated to page "<URL>"
    And I have set "<text>" to text area
    When I submit the form
    Then I should see the message "<message>"

    Examples:
      |URL|text|message|
      |https://www.selenium.dev/selenium/web/web-form.html|sample text|Received!|