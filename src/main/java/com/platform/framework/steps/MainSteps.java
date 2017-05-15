package com.platform.framework.steps;

import com.platform.framework.LoggerUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.Optional;

public class MainSteps {

    private WebDriver webDriver;
    Optional<WebElement> webElement;
    private static final Logger LOGGER = LoggerFactory.getLogger(MainSteps.class);
    private static LoggerUtil loggerUtil = LoggerUtil.getInstance();

    @Given("^the page \"([^\"]*)\" is loaded$")
    public void thePageIsLoaded(String url) throws Throwable {
//        System.out.println("thePageIsLoaded\n");
        System.setProperty("webdriver.chrome.driver", "C:/Users/vp05/Work/testFramework001/src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
//        webDriver.manage().window().maximize();
        webDriver.navigate().to(new URL(url));
        Thread.sleep(3000);
//        webElement = this.findElement(By.xpath("//*[@value='Google Search']"));
//        webElement = Optional.of(webDriver.findElement(By.xpath("//*[@value='Google-keresés']")));
//        WebElement webElement = webDriver.findElement(By.xpath("//*[@value='Google Search']"));
//        Optional<WebElement> webElement = Optional.of(webDriver.findElement(By.xpath("//*[@value='Google Search']")));
//        webDriver.findElement(By.cssSelector("div#hplogo"));
//        webDriver.findElement(By.xpath("//*/div[text()[contains(.,'Google.hu')]]"));
//        webDriver.findElement(By.xpath("//*[text()='Google.hu offered in: ']"));
//        webDriver.findElement(By.xpath("//*[@value='Google Search']"));
//        loggerUtil.log(this.getClass(), webElement.get().getText(), "info");
        //TODO: debug level message is not displayed
//        LOGGER.info("info");
//        LOGGER.debug("debug");
//        LOGGER.error("error");

        Optional<WebElement> webElement = Optional.of(webDriver.findElement(By.xpath("//*/p[contains(text(),'UserName')]")));
        if(webElement.isPresent()){
            loggerUtil.log(getClass(), "The " + url + " was loaded properly.", "info");
        }
        else{
            loggerUtil.log(getClass(), "The " + url + " was not loaded properly.", "error");
        }
        webDriver.quit();
        Thread.sleep(1000);


//        String str1 = "123";
//        String str2 = "123" + "4" + 5;
//        String str3 = "123" + (4+5);
//        String str4 = "123" + 4 + 5;
//        String str5 = "123" + "4" + "5";
//
//        System.out.println(str1 == str2);

    }

    @Given("^asd$")
    public void asd() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
