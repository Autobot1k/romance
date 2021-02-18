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
    public void testGalleriesTabs(){
        mainPage.clickPhotoTab();
        List<WebElement> userTabs = photosPage.userTabs();
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitle);

        for (int i = 0; i < userTabs.size(); i++) {
            userTabs.get(i).click();
            actualTitle = photosPage.getAnyTitle();

//            if(actualTitle.contains(Data.expectedTitleGallery) || actualTitle.contains(Data.expectedTitlePhotoGallery) ||
//                    actualTitle.contains(Data.expectedTitleVideoGallery) || actualTitle.contains(Data.expectedTitleGalleryAlbums)){
//                System.out.println("Title is valid: " + actualTitle);
//            } else {
//                Assert.fail("Title is not valid");
//            }

            if(i==0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            }
            else if(i==1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            }
            else if(i==2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
                //photosPage.ajaxclick(By.xpath("//div[@class='g-flatty-block']"));
                String textMedia = photosPage.pageBlock().getText();
                System.out.println(textMedia);
                if(textMedia.contains(Data.textMedia)){
                    System.out.println("Amazing! TextMedia is correct!");
                }
            }
            else if(i==3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
                //photosPage.ajaxclick(By.xpath("//div[@class='main-inner-content']"));
                photosPage.javaWaitSec(2);
                Assert.assertTrue(photosPage.pleaseSelect().isDisplayed());
            }
            userTabs = photosPage.userTabs();
        }
    }
}
