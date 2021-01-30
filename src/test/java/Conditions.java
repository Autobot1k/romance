import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conditions extends BaseUI {

    @Test
    public void test(){
        String fruit1 = "kiwi";
        String fruit2 = "kiwi";

        if(fruit1.contains("kiwi") || fruit2.contains("orange")){
            System.out.println("That's our fruits!");
        }else{
            Assert.fail("No fruit!");
        }
    }

    @Test
    public void test2(){
        int number = 10;
        int sum;

        if(number == 10){
            sum = 95 + 5;
        }else{
            sum = 95 - 5;
        }
        System.out.println(sum);
    }

    @Test
    public void test3(){
        boolean requirement = false;
        if(!requirement){
            System.out.println("Boolean is true");
        }else{
            Assert.fail("Boolean is not true");
        }
    }

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

    @Test
    public void test6() {
//        List<String>list1 = new ArrayList<>(Arrays.asList("kiwi", "orange", "melon"));
//        String element = list1.get(0);

        List<Integer>list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        int sum = list1.get(0) + list1.get(1);
        System.out.println(sum);
    }

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

        List<String> employees = new ArrayList<>(Arrays.asList("Alex", "John", "Bob"));
        System.out.println(employees.size());
        for (int i = 0; i < employees.size(); i++) {
            String info = employees.get(i);
            System.out.println(info);
            Assert.assertTrue(employees.contains("Alex"));
            }
        }

}