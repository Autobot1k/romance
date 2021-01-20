import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    String currentUrlSearch;
//    String currentTitleSearch;
    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://romanceabroad.com/";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void afterActions() {
        //driver.quit();
    }

}
