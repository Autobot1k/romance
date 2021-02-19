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

    public List<WebElement> userTabs(){
        List<WebElement> userTabs = driver.findElements(Locators.LIST_OF_GALLERIES);
        return userTabs;
    }

    public WebElement pageBlock (){
        WebElement pageBlock = driver.findElement(Locators.PAGE_BLOCK);
        return pageBlock;
    }

    public WebElement pleaseSelect (){
        WebElement pleaseSelect = driver.findElement(Locators.PLEASE_SELECT);
        return pleaseSelect;
    }

    public WebElement element (){
        WebElement element = driver.findElement(Locators.WRAPPER);
        return element;
    }

    public List<WebElement> users(){
        List<WebElement> users = driver.findElements(Locators.USER_NAME_LINKS);;
        return users;
    }




}
