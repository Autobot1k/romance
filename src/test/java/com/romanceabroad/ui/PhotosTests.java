package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PhotosTests extends BaseUI{

    String actualTitle;


    @Test
    public void testMediaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_PHOTOS));
        driver.findElement(Locators.LINK_PHOTOS).click();
        photosPage.javaWaitSec(5);
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
    }

    @Test
    public void testUserTabs(){
        photosPage.clickPhotoTab();
        photosPage.userTabs();
        int photoTabs = photosPage.userTabs().size();
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitle);
        for (int i = 0; i < photoTabs; i++) {
            photosPage.userTabs().get(i).click();
            actualTitle = photosPage.getAnyTitle();
            if(i==0){
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            }
            else if(i==1){
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            }
            else if(i==2){
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
            }
            else if(i==3){
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
            }
            photosPage.userTabs();
        }

    }
}
