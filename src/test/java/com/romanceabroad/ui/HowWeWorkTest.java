package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HowWeWorkTest extends BaseUI {

    String nameOfArticle;
    String titleOfArticle;

    @Test
    public void testArticlesAndTitles() {
        mainPage.clickHowWeWorkLink();
        List<WebElement> linksOfArticles = howWeWorkPage.collectAllLinksOfArticles();

        for (int i = 0; i < linksOfArticles.size(); i++) {
            WebElement link = linksOfArticles.get(i);
            nameOfArticle = link.getText();
            if (nameOfArticle.contains("How it works")) {
            } else if (nameOfArticle.contains("Kharkov dating agency")) {
            } else if (nameOfArticle.contains("Kiev dating agency")) {
            } else if (nameOfArticle.contains("Odessa dating agency")) {
            } else if (nameOfArticle.contains("Mail order girls")) {
            } else if (nameOfArticle.contains("Beautiful urkainian girls")) {
            } else if (nameOfArticle.contains("Real Ukrainian brides")) {
            } else if (nameOfArticle.contains("Eastern European women")) {
            } else if (nameOfArticle.contains("Marriage agency in Ukraine")) {
            } else if (nameOfArticle.contains("Kiev dating site")) {
            } else if (nameOfArticle.contains("Find Ukrainian girlfriend")) {
            } else if (nameOfArticle.contains("Slavic women for marriage")) {
            } else if (nameOfArticle.contains("How to marry Ukrainian lady")) {
            } else if (nameOfArticle.contains("Free Ukrainian dating site")) {
            } else if (nameOfArticle.contains("9 Factors to Keep in Mind When Dating a Ukrainian Woman")) {
            } else if (nameOfArticle.contains("Is There a Difference Between Dating or Courting a Ukrainian Woman?")) {
            }
            else{
                link.click();
                titleOfArticle = howWeWorkPage.getAnyTitle();
                Assert.assertEquals(nameOfArticle, titleOfArticle);
                linksOfArticles = howWeWorkPage.collectAllLinksOfArticles();
            }
        }
    }
}
