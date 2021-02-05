import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaTests extends BaseUI{


    @Test
    public void testMediaPage(){
        wait.until(ExpectedConditions.elementToBeClickable(Locators.LINK_PHOTOS));
        driver.findElement(Locators.LINK_PHOTOS).click();
        mediaPage.javaWaitSec(5);
        currentUrlMedia = driver.getCurrentUrl();
        System.out.println(currentUrlMedia);
        Assert.assertEquals(currentUrlMedia, Data.expectedUrlMedia);
    }
}
