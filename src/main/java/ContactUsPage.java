import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ContactUsPage extends BaseActions {

    public ContactUsPage (WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void completeContactAdministratorForm(String reason, String name, String email, String subject, String message){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(Locators.SELECT_LIST_THE_REASON_OF_CONTACT).click();
        clickValueOfLists(Locators.PICK_A_REASON, reason);

        driver.findElement(Locators.YOUR_NAME_FIELD).sendKeys(name);
        driver.findElement(Locators.YOUR_EMAIL_FIELD).sendKeys(email);
        driver.findElement(Locators.SUBJECT_FIELD).sendKeys(subject);
        driver.findElement(Locators.MESSAGE_FIELD).sendKeys(message);

        driver.findElement(Locators.BUTTON_SEND).click();
    }
}
