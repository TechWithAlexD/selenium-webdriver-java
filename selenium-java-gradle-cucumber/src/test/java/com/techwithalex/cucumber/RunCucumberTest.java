package com.techwithalex.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:com/techwithalex/features/"},
        glue = {"com.techwithalex.cucumber", "com.techwithalex.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@regression"
)
public class RunCucumberTest {
}
