package com.demoblaze.Base;

import com.demoblaze.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setupDriver(){
         driver=new DriverFactory().initializeDriver();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
