package com.demoblaze.testcases;

import com.demoblaze.Base.BaseTest;
import com.demoblaze.factory.DriverFactory;
import com.demoblaze.models.User;
import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.MainPage;
import com.demoblaze.pages.SelectedItemPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShoppingTest extends BaseTest {

    @Test(description = "Adding items to cart successfully test")
    public void addItemsToCart() throws InterruptedException {

        User user =new User();

        MainPage.getInstance().load(driver);
        MainPage.getInstance().register(driver,user);
        MainPage.getInstance().clickOnMonitorsCategory(driver);
        MainPage.getInstance().clickOnAppleMonitor(driver);
        SelectedItemPage.getInstance().addToCart(driver);
        SelectedItemPage.getInstance().clickOnCartButton(driver);
        String itemInTheCart=CartPage.getInstance().itemInTheCartText(driver);
        Assert.assertEquals(itemInTheCart,"Apple monitor 24");
    }

    @Test(description = "Deleting items from cart successfully test")
    public void deleteItemsFromTheCart() throws InterruptedException {
        User user=new User();

        MainPage.getInstance().load(driver);
        MainPage.getInstance().register(driver,user);
        MainPage.getInstance().clickOnMonitorsCategory(driver);
        MainPage.getInstance().clickOnAppleMonitor(driver);
        SelectedItemPage.getInstance().addToCart(driver);
        SelectedItemPage.getInstance().clickOnCartButton(driver);
        CartPage.getInstance().clickOnDeleteButton(driver);
        Thread.sleep(1000);
        boolean isTotalPriceDisplayed=CartPage.getInstance().isFinalPriceDisplayed(driver);
        Assert.assertFalse(isTotalPriceDisplayed);

    }

}
