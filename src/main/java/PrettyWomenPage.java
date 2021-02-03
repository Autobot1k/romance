import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrettyWomenPage extends BaseActions {


    public PrettyWomenPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickPrettyWomenTab(){
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
    }

    public void clickSearchPrettyWomen(){
        driver.findElement(Locators.SEARCH_CLICK).click();
    }








}
