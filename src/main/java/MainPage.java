import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickJoinButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistartion(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(Data.emailInput);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.PASSWORD_FIELD)));
        driver.findElement(Locators.PASSWORD_FIELD).sendKeys(Data.passwordInput);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistartion(){
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(generateNewNumber(Data.usernameInput, 10));
        driver.findElement(Locators.SELECT_DAY_FIELD).click();
        driver.findElement(Locators.PICK_A_DAY).click();
        driver.findElement(Locators.SELECT_MONTH_FIELD).click();
        driver.findElement(Locators.PICK_A_MONTH).click();
        driver.findElement(Locators.SELECT_YEAR_FIELD).click();
        driver.findElement(Locators.PICK_A_YEAR).click();
        driver.findElement(Locators.PHONE_FIELD).sendKeys(Data.phoneInput);
        driver.findElement(Locators.LOCATION_FIELD).clear();
        driver.findElement(Locators.LOCATION_FIELD).sendKeys(Data.locationInput);


        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
//        boolean selectedCheckbox = checkboxConfirmation.isSelected();
        System.out.println(Data.printCheckboxConf);
        checkboxConfirmation.click();
    }

}
