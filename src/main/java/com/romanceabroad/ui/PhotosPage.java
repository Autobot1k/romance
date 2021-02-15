package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PhotosPage extends BaseActions {

    public PhotosPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickPhotoTab(){
        driver.findElement(Locators.LINK_PHOTOS).click();
    }

    public List<WebElement> userTabs(){
        List<WebElement> userTabs = driver.findElements(Locators.LIST_OF_GALLERIES);
        return userTabs;
    }

}
