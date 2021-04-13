package com.romanceabroad.ui;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseUITestWithSauceLabs {
    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    HowWeWorkPage howWeWorkPage;
    GiftPage giftPage;
    ContactUsPage contactUsPage;
    PrettyWomenPage prettyWomenPage;
    PhotosPage photosPage;
    BlogPage blogPage;
    ProfilePage profilePage;
    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    @Parameters({"browser", "version", "platform"})
    public void setup(String browser, String version, String platform, Method method) throws MalformedURLException{

        Reports.start(method.getName());

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", "jhndoe90");
        capabilities.setCapability("accessKey", "a520d2ba-89b9-4f99-8338-cfc1d1b3ad21");
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("platform", platform);
        capabilities.setCapability("version", version);
        capabilities.setCapability("name", method.getName());
        driver = new RemoteWebDriver(
                new URL("http://" + System.getenv("SAUCE_USERNAME") + " : " + System.getenv("SAUCE_ACCESS_KEY") + "@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);

        wait = new WebDriverWait(driver, 20);
        mainPage = new MainPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        prettyWomenPage = new PrettyWomenPage(driver, wait);
        photosPage = new PhotosPage(driver, wait);
        giftPage = new GiftPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        contactUsPage = new ContactUsPage(driver, wait);
        profilePage = new ProfilePage(driver, wait);
        driver.manage().window().maximize();
        driver.get(Data.mainUrl);

    }

    @AfterMethod(groups = {"admin", "user"})
    public void afterActions(ITestResult testResult) {
        //local Reports
        if (testResult.getStatus() == ITestResult.FAILURE) {
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();

        //Sauce Labs
        ((JavascriptExecutor)driver).executeScript("sauce: job result=" + (testResult.isSuccess() ? "passed" : "failed"));
        //driver.quit();
    }
}
