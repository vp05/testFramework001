package com.platform;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/Test003.feature"},
        glue = {"com.platform.framework.steps"}
)
public class RunTestNG3Test extends AbstractTestNGCucumberTests {

}
