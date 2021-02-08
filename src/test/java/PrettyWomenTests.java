import org.testng.Assert;
import org.testng.annotations.Test;


public class PrettyWomenTests extends BaseUI {

    public static final boolean testCase1 = true;
    public static final boolean testCase2 = true;
    public static final boolean testCase3 = false;

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
    @Test(priority = 1, enabled = testCase1, groups = {"user", "admin"})
    public void prettyWomenPageTestCase1() {
        mainPage.clickPrettyWomenTab();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlPrettyWomen);
        prettyWomenPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_AGE_MIN, 2);
        prettyWomenPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_AGE_MAX, 12);
        prettyWomenPage.clickSearchPrettyWomen();

        prettyWomenPage.getDropDownListByIndex(Locators.DROP_DOWN_LIST_SORT_BY, 2);

//        prettyWomenPage.getDropDownListByText(prettyWomenPage.dropDownList(), Data.sortBY_Views);


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

    @Test(priority = 2, enabled = testCase2, groups = {"user", "admin"})
    public void prettyWomenWebPageCase2() {
        Assert.assertTrue(mainPage.prettyWomenTabIsDisplayed(), "Element is not displayed");
        mainPage.clickPrettyWomenTab();
        currentUrlPrettyWomen = driver.getCurrentUrl();
        System.out.println(currentUrlPrettyWomen);
        softAssert.assertEquals(currentUrlPrettyWomen, Data.expectedUrlPrettyWomen, "Element is not displayed");
        softAssert.assertEquals(currentUrlPrettyWomen, Data.expectedUrlPrettyWomen, "Element is not displayed");
        prettyWomenPage.getDropDownListByText(prettyWomenPage.dropDownListSortBy(), Data.sortBY_Views);
        softAssert.assertAll();
    }


    @Test(priority = 3, enabled = testCase3, groups = {"admin", "user", "chrome"})
    public void selectRandomDropDownListCase3() {
        mainPage.clickPrettyWomenTab();
        int sizeOfDropDownList = prettyWomenPage.getSizeDropDownList(Locators.DROP_DOWN_LIST_AGE_MAX);
        System.out.println(sizeOfDropDownList);

        for (int i = 0; i < sizeOfDropDownList; i++) {
            prettyWomenPage.selectItemDropDownRandomOption(Locators.DROP_DOWN_LIST_AGE_MAX, "Age MAX");
            prettyWomenPage.javaWaitSec(3);
        }
    }

}
