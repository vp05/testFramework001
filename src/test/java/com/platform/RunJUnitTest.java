package com.platform;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
)

public class RunJUnitTest {

    @BeforeClass
    public static void setup() {
        System.out.println("com.platform.RunJUnitTest");
    }
}
