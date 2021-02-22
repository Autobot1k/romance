package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ProfileTest extends BaseUI {

    @Test
    public void profilePageTest() {
        mainPage.clickPhotoTab();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='wrapper']"))));
        List<WebElement> users = driver.findElements(By.xpath("//a[@class='g-users-gallery__name']"));
        for (int i = 0; i < users.size(); i++) {
            users.get(i).click();
            profilePage.javaWaitSec(3);
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            //driver.close();
            driver.switchTo().window(tabs2.get(1));
            profilePage.ajaxClick(driver.findElement(By.xpath("//div[@id='main_page']")));
            String description = driver.findElement(By.xpath("//div[contains(@class, 'user-description')]")).getText();
            System.out.println(description);
            System.out.println("---------------------");

            String[] splitedPhrase = description.split(" ");
            String actualCountry = splitedPhrase[7];
            System.out.println(actualCountry);
            System.out.println("----------------");
            Assert.assertEquals(actualCountry, "Ukraine");
            driver.close();
            driver.switchTo().window(tabs2.get(0));
        }
        users = driver.findElements(By.xpath("//a[@class='g-users-gallery__name']"));

        //profilePage.ajaxClick(driver.findElement(By.xpath("//a[contains(text(),'Wall')]")));
//        profilePage.javaWaitSec(2);
//        List<WebElement> photos = driver.findElements(By.xpath("//span[@class='g-pic-border g-rounded']"));
//        int quantity = photos.size();
//        System.out.println(quantity);


    }


//    @Test
//    public void profilePageTest() {
//        mainPage.clickPhotoTab();
//        wait.until(ExpectedConditions.visibilityOf(photosPage.element()));
//        List<WebElement> users = photosPage.users();
////        List<WebElement> users = driver.findElements(By.xpath("//div[@class='text-overflow']"));
//        for (int i = 0; i < users.size(); i++) {
//            if (i % 2 == 0) {
//
//                String info = users.get(i).getText();
//
//                String[] splitedPhrase = info.split(",");
//                String age = splitedPhrase[1];
//                int ageNum = Integer.parseInt(age);
//
//                if(30 >= ageNum && ageNum <= 45){
//                    System.out.println("This age: " + ageNum + " is correct");
//                }else {
//                    Assert.fail("Wrong age: " + ageNum);
//                }
//                users = driver.findElements(By.xpath("//div[@class='text-overflow']"));


//            users.get(0).click();
//            String secondTab = driver.getWindowHandle();
//            driver.switchTo().window(secondTab);
//            String title = driver.findElement(Locators.H1_TITLE).getText();
//            System.out.println(title);
//            break;
//            profilePage.javaWaitSec(3);

//            WebElement location = driver.findElement(By.xpath("//a[@href='https://romanceabroad.com/users/view/311/wall']"));




//            WebElement info = driver.findElement(Locators.H1_TITLE);
//            String actualTitle = info.getText();
//            Assert.assertEquals(actualTitle, Data.expectedTitle);
//            System.out.println(actualTitle);
//            break;


//            String actualCountry = location.getText();
//            System.out.println(actualCountry);
//            if (i == 0) {
//                Assert.assertEquals(actualCountry, "Ukraine");
//            }
//            users = driver.findElements(By.xpath("//a[@class='g-users-gallery__name']"));
}






