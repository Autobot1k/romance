import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GiftTests extends BaseUI {

    @Test
    public void testLinkGiftsPage() {
        mainPage.clickGiftsLink();
        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertEquals(currentUrl, Data.expectedUrlGifts);
    }


    @Test
    public void testValueOfTheListInFooterMenuGiftsPage() {
        mainPage.clickGiftsLink();
        giftPage.javaWaitSec(3);
        giftPage.clickValueOfList(Locators.FOOTER_MENU_LIST, "News");
        Assert.assertTrue(giftPage.titleContainsNews());

    }

    @Test
    public void compareGiftTitlesWithOptions() {

        WebElement giftsLink = driver.findElement(Locators.LINK_GIFTS);
        List<WebElement> gifts = driver.findElements(Locators.GIFTS_TITLES);
        List<String> options = new ArrayList<>(Arrays.asList("Spa", "Chocolate and fruits", "Teddy bear", "Flower basket", "Sushi sets", "TOURS TO UKRAINE"));

        System.out.println(driver.findElements(Locators.TABS_OF_MAIN_PAGE).size());
        giftsLink.click();

        System.out.println(driver.findElements(Locators.GIFTS_TITLES).size());

        for (int i = 0; i < driver.findElements(Locators.GIFTS_TITLES).size(); i++) {

            String info = driver.findElements(Locators.GIFTS_TITLES).get(i).getText();
            System.out.println(info);

            if (info.contains(options.get(i)))
                actualUrlGifts = driver.getCurrentUrl();
            Assert.assertEquals(actualUrlGifts, Data.expectedUrlGifts);

        }
    }

}
