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

//    public WebElement dropDownList(){
//        WebElement dropDownListelement = driver.findElement(Locators.DROP_DOWN_LIST_SORT_BY);
//        return dropDownListelement;
//    }








}
