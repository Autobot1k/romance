import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI{

    @Test
    public void testSearchPage(){
        driver.findElement(Locators.LINK_SEARCH).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlSearch);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select1 = new Select(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MIN));
        select1.selectByIndex(2);
        Select select2 = new Select(driver.findElement(Locators.DROP_DOWN_LIST_AGE_MAX));
        select2.selectByIndex(12);

        driver.findElement(Locators.SEARCH_CLICK).click();

        WebElement dropDownListSortBy = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
        searchPage.getDropDownListByText(dropDownListSortBy, Data.sortBY_Views);

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

}
