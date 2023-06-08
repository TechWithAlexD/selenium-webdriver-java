package com.techwithalex.tests;

import com.techwithalex.base.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeleniumTests extends TestBase {

    @Test
    public void submitFormTest(){

        String text = goToHomePage()
                .writeTextToTextArea("sample text")
                .submitForm()
                .getMessage();

        Assertions.assertEquals("Received!", text);
    }
}
