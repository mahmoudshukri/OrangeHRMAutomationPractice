package com.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
    @BeforeClass
    @Parameters({"browser"})
    public void setUpDriver(@Optional("chrome") String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
