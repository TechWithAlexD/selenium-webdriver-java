package com.techwithalex.tests;

import com.techwithalex.base.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class SeleniumTests extends TestBase {

    @Test
    public void submitFormTest() {

        String text = goToHomePage()
                .writeTextToTextArea("sample text")
                .submitForm()
                .getMessage();

        Assertions.assertEquals("Received!", text);
    }

    @Test
    public void submitFormSecondTest() {

        String text = goToHomePage()
                .writeTextToTextArea("sample text2")
                .submitForm()
                .getMessage();

        Assertions.assertEquals("Received!", text);
    }

}
