package com.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectedItemPage {
    private final By addToCartButton=By.cssSelector("[onclick=\"addToCart(10)\"]");
    private final By cartButton =By.cssSelector("[id=\"cartur\"]");

    public void addToCart(WebDriver driver) throws InterruptedException {
        driver.findElement(addToCartButton).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

    }

    public void clickOnCartButton(WebDriver driver) throws InterruptedException {
        driver.findElement(cartButton).click();
        Thread.sleep(1000);
    }

    private SelectedItemPage(){}                      //forSingletonPattern
    private static SelectedItemPage selectedItemPage; //forSingletonPattern

    public static SelectedItemPage getInstance(){    //forSingletonPattern
        if(selectedItemPage==null){
            selectedItemPage=new SelectedItemPage();
        }
        return selectedItemPage;
    }
}
