import org.testng.Assert;
import org.testng.annotations.Test;


public class GiftTests extends BaseUI {

    @Test
    public void testGiftsPage() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedUrlGifts);
    }

}
