package com.demoblaze.pages;

import com.demoblaze.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
        private final By signUpButton = By.cssSelector("[id=\"signin2\"]");
        private final By signUpUserNameInput = By.cssSelector("[id=\"sign-username\"]");
        private final By signUpPasswordInput = By.cssSelector("[id=\"sign-password\"]");
        private final By confirmSignUp = By.cssSelector("[onclick=\"register()\"]");
        private final By loginButton = By.cssSelector("[id=\"login2\"]");
        private final By loginUsernameInput = By.cssSelector("[id=\"loginusername\"]");
        private final By loginPasswordInput = By.cssSelector("[id=\"loginpassword\"]");
        private final By confirmLogin = By.cssSelector("[onclick=\"logIn()\"]");
        private final By welcomeUser=By.partialLinkText("Welcome");
        private final By monitorsCategory=By.cssSelector("[onclick=\"byCat('monitor')\"]");
        private final By appleMonitor=By.linkText("Apple monitor 24");


        public void load(WebDriver driver){
            driver.get("https://www.demoblaze.com/");

        }

        public void register(WebDriver driver, User user) throws InterruptedException {
            driver.findElement(signUpButton).click();
            driver.findElement(signUpUserNameInput).sendKeys(user.getUserName());
            Thread.sleep(300);
            driver.findElement(signUpPasswordInput).sendKeys(user.getPassword());
            driver.findElement(confirmSignUp).click();
            Thread.sleep(1500);
            driver.switchTo().alert().accept();
            driver.findElement(loginButton).click();
            driver.findElement(loginUsernameInput).sendKeys(user.getUserName());
            Thread.sleep(300);
            driver.findElement(loginPasswordInput).sendKeys(user.getPassword());
            driver.findElement(confirmLogin).click();
            Thread.sleep(1000);

        }

        public String isWelcomeUserDisplayed(WebDriver driver){

            return driver.findElement(welcomeUser).getText();
        }

        //****************

    public void clickOnMonitorsCategory(WebDriver driver) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(monitorsCategory).click();
    }

    public void clickOnAppleMonitor(WebDriver driver){
        driver.findElement(appleMonitor).click();
    }


    //*******************************************************


    private static MainPage mainPage; //for singleton pattern
    private MainPage(){} //constructor for singleton pattern

    public static MainPage getInstance(){ //for singleton pattern
        if(mainPage==null){
            mainPage=new MainPage();
        }
        return mainPage;
    }
    }

