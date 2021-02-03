import org.testng.Assert;
import org.testng.annotations.Test;


public class GiftTests extends BaseUI {

    @Test
    public void testGiftsPage() {
        driver.findElement(Locators.LINK_GIFTS).click();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlGifts);
    }

}
