package com.demoblaze.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final By itemInCart=By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]");
    private final By deleteButton=By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
    private final By totalPrice=By.xpath("//*[@id=\"totalp\"]");


    public String itemInTheCartText(WebDriver driver){
        return driver.findElement(itemInCart).getText();
    }

    public void clickOnDeleteButton(WebDriver driver){
        driver.findElement(deleteButton).click();
    }

    public boolean isFinalPriceDisplayed(WebDriver driver){
        return driver.findElement(totalPrice).isDisplayed();
    }

    private CartPage (){}             //forSingletonPattern
    private static CartPage cartPage; //forSingletonPattern
    public static CartPage getInstance(){    //forSingletonPattern
        if(cartPage==null){
            cartPage=new CartPage();
        }
        return cartPage;
    }
}
