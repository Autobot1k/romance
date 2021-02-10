import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HowWeWorkPage extends BaseActions{

    public HowWeWorkPage(WebDriver driver, WebDriverWait wait){super(driver, wait);}

    public List<WebElement> collectAllLinksOfArticles(){
        List<WebElement> linksOfArticles = driver.findElements(Locators.LINKS_OF_ARTICLES);
        return linksOfArticles;
        }

    }


