package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ProfileTest extends BaseUI {


    @Test
    public void profilePageTest() {
        mainPage.clickPhotoTab();
        wait.until(ExpectedConditions.visibilityOf(photosPage.element()));
        List<WebElement> users = photosPage.users();
        for (int i = 0; i < users.size(); i++) {
            users.get(i).click();
            profilePage.javaWaitSec(3);
//            WebElement location = driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/users/view/311/wall']"));
            WebElement info = driver.findElement(Locators.H1_TITLE);
            String actualTitle = info.getText();
            Assert.assertEquals(actualTitle, Data.expectedTitle);
            System.out.println(actualTitle);
            break;
//            String actualCountry = location.getText();
//            System.out.println(actualCountry);
//            if (i == 0) {
//                Assert.assertEquals(actualCountry, "Ukraine");
//            }
//            users = driver.findElements(By.xpath("//a[@class='g-users-gallery__name']"));
        }
    }
}



