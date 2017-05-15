package com.platform;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.TestNG;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

@CucumberOptions(
//        features = {"src/test/resources/features/Test001.feature", "src/test/resources/features/Test003.feature"},
        features = {"src/test/resources/features/Test001.feature"},
        glue = {"com.platform.framework.steps"}
)
public class RunTestNG1Test extends AbstractTestNGCucumberTests {

}
