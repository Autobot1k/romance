import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationsTests extends BaseUI{

    @Test
    public void testRegistration(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(Data.emailInput);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.PASSWORD_FIELD)));
        driver.findElement(Locators.PASSWORD_FIELD).sendKeys(Data.passwordInput);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(Data.usernameInput);
        driver.findElement(Locators.PHONE_FIELD).sendKeys(Data.phoneInput);
        driver.findElement(Locators.LOCATION_FIELD).clear();
        driver.findElement(Locators.LOCATION_FIELD).sendKeys(Data.locationInput);

        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(selectedCheckbox + Data.printCheckboxConf);
        checkboxConfirmation.click();
    }


}
