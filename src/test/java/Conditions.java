import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

//    @Test
//    public void test(){
//        String fruit1 = "kiwi";
//        String fruit2 = "kiwi";
//
//        if(fruit1.contains("kiwi") || fruit2.contains("orange")){
//            System.out.println("That's our fruits!");
//        }else{
//            Assert.fail("No fruit!");
//        }
//    }
//
//    @Test
//    public void test2(){
//        int number = 10;
//        int sum;
//
//        if(number == 10){
//            sum = 95 + 5;
//        }else{
//            sum = 95 - 5;
//        }
//        System.out.println(sum);
//    }
//
//    @Test
//    public void test3(){
//        boolean requirement = false;
//        if(!requirement){
//            System.out.println("Boolean is true");
//        }else{
//            Assert.fail("Boolean is not true");
//        }
//    }
//
    @Test
    public void test4(){
        WebElement tabSearch = driver.findElement(Locators.LINK_SEARCH);

        if(tabSearch.isDisplayed()){
            tabSearch.click();
        }else{
            Assert.fail("We can't find Pretty Women tab");
        }
    }

    @Test
    public void test5() {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistartion();

        WebElement checkbox = driver.findElement(Locators.CHECKBOX_CONFIRMATION);

        if(!checkbox.isSelected()){
            checkbox.click();
            System.out.println("Checkbox is selected");

        }
    }

//    @Test
//    public void test6() {
////        List<String>list1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
////        String element = list1.get(0);
//
//        List<Integer>list1 = new ArrayList<>(Arrays.asList(18, 30));
//        int sum = list1.get(0) + list1.get(1);
//        System.out.println(sum);
//    }

    @Test
    public void test7() {

        List<WebElement> links = driver.findElements(Locators.MAIN_PAGE_LIST);
        System.out.println(links.size());
        for (int i = 0; i < links.size(); i++) {
            String info = links.get(i).getText();
            System.out.println(info);
            links.get(i).click();
            driver.get(Data.MAIN_URL);
            links = driver.findElements(Locators.MAIN_PAGE_LIST);

        }

    }

    @Test
    public void test8() {

        List<WebElement> list = driver.findElements(By.xpath("//ul//li"));
        for (int i = 0; i < list.size(); i++) {
            if (i == 3) {
                list.get(i).click();
            }
        }
    }


    @Test
    public void test9() {

        List<String> tabs = new ArrayList<>(Arrays.asList("GIFTS", "BLOG"));
        for (int i = 0; i < tabs.size(); i++) {
            System.out.println(tabs.get(i));
            if (driver.findElement(Locators.LINK_GIFTS).getText().contains(tabs.get(i))) {
                driver.findElement(Locators.LINK_GIFTS).click();
            }
        }
    }

    @Test
    public void test10() {
        List<WebElement> list = driver.findElements(By.xpath("//ul//li"));
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i).getText());
            if(list.get(i).getText().contains("GIFTS")){
                searchPage.clickPrettyWomenTab();
                break;
            }
        }
    }

    @Test
    public void test11(){
        List<Integer> blackList = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        List<WebElement> tabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
        for (int i = 0; i <tabs.size(); i++) {
            System.out.println(tabs.get(i).getText());
            if(!blackList.contains(i)) {
                System.out.println("Print number of tab for click: " + i);
                tabs.get(i).click();
                driver.navigate().back();
                tabs = driver.findElements(By.xpath("//ul[@class='navbar-nav']//li"));
            }
        }
    }

    @Test
    public void test12() {
        WebElement photo_tab = driver.findElement(Locators.LINK_PHOTOS);
        photo_tab.click();
        List<WebElement> tabs = driver.findElements(By.xpath("//ul[@class='b-tabs']//li"));
        for (int i = 0; i < tabs.size(); i++) {
            System.out.println(tabs.get(i).getText());
            if(tabs.get(i).getText().contains("Photo")){
                mediaPage.clickPhotoTab();
                break;
            }
        }
    }

}
