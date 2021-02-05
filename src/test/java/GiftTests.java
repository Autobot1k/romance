import org.testng.Assert;
import org.testng.annotations.Test;


public class GiftTests extends BaseUI {

    @Test
    public void testGiftsPage() {
        mainPage.clickGiftsLink();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlGifts);
    }


    //It actually work, but I guess have to use try/catch for invisible element "Mobile" from the list. Need better understanding for that
    @Test
    public void testGiftsPage2() {
        mainPage.clickGiftsLink();
        giftPage.javaWaitSec(3);
        giftPage.clickValueOfList(Locators.FOOTER_MENU_LIST, "News");

    }

}
