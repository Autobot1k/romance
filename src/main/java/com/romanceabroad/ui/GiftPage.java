package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftPage extends BaseActions{

    public GiftPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean titleContainsNews(){
        boolean titleContainsNews = driver.findElement(Locators.TITLE_OF_NEWS_PAGE).getText().contains("News");
        return titleContainsNews;
    }
}
