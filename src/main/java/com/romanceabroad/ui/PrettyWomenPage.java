package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PrettyWomenPage extends BaseActions {


    public PrettyWomenPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickSearchPrettyWomen() {
        driver.findElement(Locators.SEARCH_CLICK).click();
    }

    public String actualTitlePrettyWomenPage() {
        String actualTitlePrettyWomenPage = driver.findElement(Locators.PRETTY_WOMEN_PAGE_TITLE).getText();
        return actualTitlePrettyWomenPage;
    }

    public WebElement dropDownListSortBy() {
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        return dropDownListSortBy;
    }

    public List<WebElement> infoListAboutUser() {
        List<WebElement> infoAboutUser = driver.findElements(Locators.LIST_OF_WOMEN);
        return infoAboutUser;
    }


    public void clickMobileMenu2() {
        if (driver.findElement(Locators.MOBILE_MENU).isDisplayed()) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

    public void clickMobileMenu3() {
        if (driver.findElements(Locators.MOBILE_MENU).size() > 0) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

    public void clickMobileMenu() {
        try {
            driver.findElement(Locators.MOBILE_MENU).click();
        } catch (Exception e) {
        }
    }

    public void clickSearchParametrs(String valueOfBox) {
        if (valueOfBox.contains("mobile")) {
            driver.findElement(Locators.MOBILE_SEARCH_PARAMETRS).click();
        }
    }
}


//    public WebElement dropDownList(){
//        WebElement dropDownListelement = driver.findElement(com.romanceabroad.ui.Locators.DROP_DOWN_LIST_SORT_BY);
//        return dropDownListelement;
//    }









