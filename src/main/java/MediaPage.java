import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MediaPage extends BaseActions {

    public MediaPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void clickPhotoTab(){
        driver.findElement(Locators.PHOTO_TAB).click();
    }
}
