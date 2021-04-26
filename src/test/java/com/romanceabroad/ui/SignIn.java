package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignIn extends BaseUI {

    @Test(dataProvider = "NewRequirementsForPassword", dataProviderClass = DataProviders.class)
    public void password(String password, boolean requirement) {

        mainPage.clickSignIn();
        mainPage.fillInSignInForm(password);

        if(!requirement){
            Assert.assertTrue(driver.findElement(Locators.ALERT_WRONG_PASSWORD).isDisplayed());
        }

    }
}
