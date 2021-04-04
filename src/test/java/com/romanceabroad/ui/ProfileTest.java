package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Listeners(VideoListener.class)

public class ProfileTest extends BaseUI {

    @Video(name = "ProfilePage test")
    @Test
    public void profilePageTest() {
        mainPage.clickPhotoTab();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='wrapper']"))));
        List<WebElement> users = driver.findElements(By.xpath("//a[@class='g-users-gallery__name']"));
        for (int i = 0; i < users.size(); i++) {
            users.get(i).click();
            profilePage.javaWaitSec(3);
            driver.close();
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(0));


//            driver.get("https://romanceabroad.com/users/view/311/profile");
            profilePage.ajaxClick(driver.findElement(By.xpath("//div[@id='main_page']")));
            String description = driver.findElement(By.xpath("//div[contains(@class, 'user-description')]")).getText();
            System.out.println(description);
            System.out.println("---------------------");

            String[] splitedPhrase = description.split(" ");
            String actualCountry = splitedPhrase[7];
            System.out.println(actualCountry);
            System.out.println("----------------");
            Assert.assertEquals(actualCountry, "Ukraine");
//            driver.close();
            driver.get("https://romanceabroad.com/media/index");
            photosPage.javaWaitSec(1);
            users = driver.findElements(By.xpath("//a[@class='g-users-gallery__name']"));

//            int userCount = users.size();
//            System.out.println(userCount);
//            System.out.println(driver.findElement(Locators.H1_TITLE).getText());
        }
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






