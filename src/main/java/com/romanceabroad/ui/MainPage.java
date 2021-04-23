package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends BaseActions {

    @FindBy(xpath = "//button[@id='show-registration-block']")
    WebElement registrationButton;


    String currentUrlBlog;

    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public void clickJoinButton(){
        Reports.log("Wait Join button");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_REGISTRATION));
        Reports.log("Click Join button");
        registrationButton.click();
    }

    public void completeFirstPartOfRegistration(String email, String password){
        Reports.log("Wait email text field");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_FIELD)));

        Reports.log("Type email in text field: " + email);
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(email);

        Reports.log("Wait password text field");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.PASSWORD_FIELD)));

        Reports.log("Type password in text field: " + password);
        driver.findElement(Locators.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickButtonNext(){
        Reports.log("Wait Next button");
        wait.until(ExpectedConditions.elementToBeClickable(Locators.BUTTON_NEXT));
        Reports.log("Click Next button");
        driver.findElement(Locators.BUTTON_NEXT).click();
    }

    public void clickButtonSignIn(){
        driver.findElement(Locators.BUTTON_SignIn).click();
    }

    public void completeSignInForm(String email, String password){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.EMAIL_SIGN_IN)));
        driver.findElement(Locators.EMAIL_SIGN_IN).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.PASSWORD_SIGN_IN)));
        driver.findElement(Locators.PASSWORD_SIGN_IN).sendKeys(password);
    }

    public void completeSecondPartOfRegistration(String userNameInput, String day, String month, String year, String phone, String location, String specific_location){
        Reports.log("Type nickname: " + userNameInput);
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(userNameInput);

        Reports.log("Click list of days");
        driver.findElement(Locators.SELECT_DAY_FIELD).click();

        Reports.log("Select specific day: " + day);
        clickValueOfLists(Locators.PICK_A_DAY, day);

        Reports.log("Click list of month");
        driver.findElement(Locators.SELECT_MONTH_FIELD).click();

        Reports.log("Select specific month: " + month);
        clickValueOfLists(Locators.PICK_A_MONTH, month);

        Reports.log("Click list of year");
        driver.findElement(Locators.SELECT_YEAR_FIELD).click();

        Reports.log("Select specific year: " + year);
        clickValueOfLists(Locators.PICK_A_YEAR, year);

        Reports.log("Type phone number: " + phone);
        driver.findElement(Locators.PHONE_FIELD).sendKeys(phone);

        Reports.log("Clean location autofilling form");
        driver.findElement(Locators.LOCATION_FIELD).clear();

        Reports.log("Type location: " + location);
        driver.findElement(Locators.LOCATION_FIELD).sendKeys(location);

        Reports.log(": " + phone);
        clickValueOfLists(Locators.LIST_OF_SPECIFIC_LOCATIONS, specific_location);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.CHECKBOX_CONFIRMATION)));
        Reports.log("Click confirmation checkbox");
        driver.findElement(com.romanceabroad.ui.Locators.CHECKBOX_CONFIRMATION).click();


//        WebElement checkboxConfirmation = driver.findElement(com.romanceabroad.ui.Locators.CHECKBOX_CONFIRMATION);
//        boolean selectedCheckbox = checkboxConfirmation.isSelected();
//        System.out.println(com.romanceabroad.ui.Data.printCheckboxConf);
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

    public void clickMobileMenu(String valueOfBox) {
        if (valueOfBox.contains("mobile")) {
            driver.findElement(Locators.MOBILE_MENU).click();
        }
    }

    public void clickSignInTab(){
        driver.findElement(Locators.LINK_SignIn).click();
    }

    public void clickPhotoTab(){
        driver.findElement(Locators.LINK_PHOTOS).click();
    }



}
