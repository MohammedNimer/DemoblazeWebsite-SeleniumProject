package com.demoblaze.testcases;

import com.demoblaze.Base.BaseTest;
import com.demoblaze.factory.DriverFactory;
import com.demoblaze.models.User;
import com.demoblaze.pages.MainPage;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserTest extends BaseTest {


    @Test(description = "Registration and login functionalities test")
    public void registerAndLogin() throws InterruptedException {
        User user=new User();
        MainPage.getInstance().load(driver);
        MainPage.getInstance().register(driver,user);
        String isWelcomeUserDisplayed= MainPage.getInstance().isWelcomeUserDisplayed(driver);
        Assert.assertEquals(isWelcomeUserDisplayed,"Welcome "+user.getUserName());
        System.out.println(isWelcomeUserDisplayed);

    }
}
