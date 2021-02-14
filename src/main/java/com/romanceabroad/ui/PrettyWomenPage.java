package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PrettyWomenPage extends BaseActions {


    public PrettyWomenPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public void clickSearchPrettyWomen(){
        driver.findElement(Locators.SEARCH_CLICK).click();
    }

    public String actualTitlePrettyWomenPage(){
        String actualTitlePrettyWomenPage = driver.findElement(Locators.PRETTY_WOMEN_PAGE_TITLE).getText();
        return actualTitlePrettyWomenPage;
    }

    public WebElement dropDownListSortBy(){
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        return dropDownListSortBy;
    }

    public List<WebElement> infoListAboutUser(){
        List<WebElement> infoAboutUser = driver.findElements(Locators.LIST_OF_WOMEN);
        return infoAboutUser;
    }


//    public WebElement dropDownList(){
//        WebElement dropDownListelement = driver.findElement(com.romanceabroad.ui.Locators.DROP_DOWN_LIST_SORT_BY);
//        return dropDownListelement;
//    }








}
