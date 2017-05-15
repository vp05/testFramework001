package com.platform;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/Test004.feature"},
        glue = {"com.platform.framework.steps"}
)
public class RunTestNG4Test extends AbstractTestNGCucumberTests {

}
