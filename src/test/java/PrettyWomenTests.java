import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PrettyWomenTests extends BaseUI{

    //Before Optimization

//    @Test
//    public void prettyWomenPage(){
//        driver.findElement(Locators.LINK_SEARCH).click();
//        currentUrlSearch = driver.getCurrentUrl();
//        System.out.println(currentUrlSearch);
//        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Select select1 = new Select(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MIN));
//        select1.selectByIndex(2);
//        Select select2 = new Select(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MAX));
//        select2.selectByIndex(12);
//
//        driver.findElement(Locators.SEARCH_CLICK).click();
//
//        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
//        searchPage.getDropDownListByText(dropDownListSortBy, Data.sortBY_Views);
//
//    }
//

    //After Optimization
    @Test
    public void prettyWomenPage(){
        prettyWomenPage.clickPrettyWomenTab();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlPrettyWomen);
        prettyWomenPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_AGE_MIN, 2);
        prettyWomenPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_AGE_MAX, 12);
        prettyWomenPage.clickSearchPrettyWomen();
        prettyWomenPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 2);

//        WebElement dropDownList = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
//        prettyWomenPage.navigateToDropDownListSortBy(dropDownList, Data.sortBY_Views);
//        prettyWomenPage.getDropDownListByText(dropDownListSortBy, Data.sortBY_Views);

    }

//    @Test
//    public void testRadioButton(){
//        if(driver.findElement(By.xpath("//input[@value='V1']")).isSelected()){
//            System.out.println("Radio button is selected");
//        }else{
//            driver.findElement(By.xpath("//input[@value='V1']")).click();
//        }
//
//    }
//
//
//    @Test
//    public void testRadioButton2(){
//        if(!driver.findElement(By.xpath("//input[@id='three']")).isSelected()){
//            driver.findElement(By.xpath("//input[@id='three']")).click();
//        }
//    }

    @Test
    public void testPrettyWomenPage() {
        Assert.assertTrue(driver.findElement(Locators.LINK_PRETTY_WOMEN).isDisplayed(), "Element is not displayed");
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
        currentUrlPrettyWomen = driver.getCurrentUrl();
        System.out.println(currentUrlPrettyWomen);
        softAssert.assertEquals(currentUrlPrettyWomen, Data.expectedUrlPrettyWomen, "Element is not displayed");
        softAssert.assertEquals(currentUrlPrettyWomen, Data.expectedUrlPrettyWomen, "Element is not displayed");
        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        prettyWomenPage.getDropDownListByText(dropDownListSortBy, Data.sortBY_Views);
        softAssert.assertAll();
    }

}
