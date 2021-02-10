import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {



    String currentUrlBlog;

    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickJoinButton(){
        driver.findElement(Locators.BUTTON_REGISTRATION).click();
    }

    public void completeFirstPartOfRegistration(String email, String password){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_FIELD)));
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.PASSWORD_FIELD)));
        driver.findElement(Locators.PASSWORD_FIELD).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void clickButtonNext(){
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void completeSecondPartOfRegistration(String userNameInput, String day, String month, String year, String phone, String location, String specific_location){
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(userNameInput);

        driver.findElement(Locators.SELECT_DAY_FIELD).click();
        clickValueOfLists(Locators.PICK_A_DAY, day);

        driver.findElement(Locators.SELECT_MONTH_FIELD).click();
        clickValueOfLists(Locators.PICK_A_MONTH, month);

        driver.findElement(Locators.SELECT_YEAR_FIELD).click();
        clickValueOfLists(Locators.PICK_A_YEAR, year);

        driver.findElement(Locators.PHONE_FIELD).sendKeys(phone);

        driver.findElement(Locators.LOCATION_FIELD).clear();
        driver.findElement(Locators.LOCATION_FIELD).sendKeys(location);
        clickValueOfLists(Locators.LIST_OF_SPECIFIC_LOCATIONS, specific_location);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.CHECKBOX_CONFIRMATION)));

//        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
//        boolean selectedCheckbox = checkboxConfirmation.isSelected();
//        System.out.println(Data.printCheckboxConf);
//        checkboxConfirmation.click();
    }

    public int verifyIframeSizeFromMainPage(){
        int size = driver.findElements(By.xpath("//iframe")).size();
        System.out.println(size + " iframe number");
        return size;
    }

    public void clickHowWeWorkLink(){
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
    }

    public void clickGiftsLink(){
        driver.findElement(Locators.LINK_GIFTS).click();
    }

    public void getNavigateToBlogLink(By locator){
        driver.findElement(locator).click();
    }
    public String verifyBlogLinkIsDisplayed(){
        getNavigateToBlogLink(Locators.LINK_BLOG);
        currentUrlBlog = driver.getCurrentUrl();
        return currentUrlBlog;
    }

    public String actualTitleHowWeWork(){
        String actualTitleHowWEWork = driver.findElement(Locators.HOW_WE_WORK_PAGE_TITLE).getText();
        return actualTitleHowWEWork;
    }

    public boolean prettyWomenTabIsDisplayed(){
        boolean prettyWomenTabIsDisplayed = driver.findElement(Locators.LINK_PRETTY_WOMEN).isDisplayed();
        return prettyWomenTabIsDisplayed;
    }

    public void clickPrettyWomenTab(){
        driver.findElement(Locators.LINK_PRETTY_WOMEN).click();
    }

    public List<WebElement> getMainTabs(){
        List<WebElement> mainTabs = driver.findElements(Locators.TABS_OF_MAIN_PAGE);
        return mainTabs;
    }

    public WebElement passwordField(){
        WebElement passwordField = driver.findElement(Locators.PASSWORD_FIELD);
        return passwordField;
    }

    public WebElement emailField(){
        WebElement emailField = driver.findElement(Locators.EMAIL_FIELD);
        return emailField;
    }

    public WebElement findVideoOnMainPage(){
        WebElement videoOnMainPage = driver.findElement(Locators.FIND_YOU_TUBE_VIDEO);
        return videoOnMainPage;
    }

    public void clickVideoOnMainPage(){
        driver.findElement(Locators.CLICK_YOU_TUBE_VIDEO).click();
    }

    public void clickCheckBoxConfirmation(){
        driver.findElement(Locators.CHECKBOX_CONFIRMATION).click();
    }

    public boolean captchTitleIsDisplayed(){
        boolean captchTitleIsDisplayed = driver.findElement(Locators.CAPTCHA_TITLE).isDisplayed();
        return captchTitleIsDisplayed;
    }



}
