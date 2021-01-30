import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationsTests extends BaseUI{

    @Test
    public void testRegistration(){
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistartion();
        mainPage.completeSecondPartOfRegistartion();
//        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
//        if(!driver.findElement(Locators.LINK_SEARCH).isDisplayed()){
//            checkboxConfirmation.click();
//        }else{
//            Assert.fail("Checkbox is already selected");
//        }
    }
}
