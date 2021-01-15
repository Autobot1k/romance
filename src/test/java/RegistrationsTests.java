import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationsTests extends BaseUI{

    @Test
    public void testRegistration(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(Data.emailInput);
        driver.findElement(Locators.PASSWORD_FIELD).sendKeys(Data.passwordInput);
        driver.findElement(Locators.BUTTON_NEXT).click();
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(Data.usernameInput);
        driver.findElement(Locators.PHONE_FIELD).sendKeys(Data.phoneInput);
    }
}
