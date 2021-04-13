package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseUI {
    String info;
    String currentUrlPrettyWomen;
    String currentUrl;
    String currentUrlMedia;
    String actualUrlGifts;
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

    protected TestBox testBox;
    protected TestBrowser testBrowser;

    protected enum TestBox{
        LOCAL, SAUCE
    }

    protected enum TestBrowser{
        CHROME, FIREFOX, SAFARI
    }


    @BeforeMethod(groups = {"user", "admin", "chrome"}, alwaysRun = true)
    @Parameters({"browser", "version", "platform", "testbox"})

//if you don't want to run your testCases inside the class and you use always TestNG.xml, you don't need @Optional parameter
    public void setup(@Optional("chrome") String browser, @Optional("null") String version, @Optional("null") String platform, @Optional("null") String testbox, Method method) throws MalformedURLException {

        if(testbox.equalsIgnoreCase("local")){
            testBox = TestBox.LOCAL;
        }else if(testbox.equalsIgnoreCase("sauce")){
            testBox =TestBox.SAUCE;
        }

        switch (testBox) {
            case LOCAL:

            Reports.start(method.getDeclaringClass().getName() + " : " + method.getName());
            // Check if parameter passed from TestNG is 'firefox'
            if (browser.equalsIgnoreCase("firefox")) {

                // Create firefox instance

                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

                driver = new FirefoxDriver();

            }

            // Check if parameter passed as 'chrome'

            else if (browser.equalsIgnoreCase("chrome")) {

                // Set path to chromedriverOld.exe

                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

                // Create chrome instance

                driver = new ChromeDriver();

                driver.get("chrome://settings/clearBrowserData");

//            } else if (browser.equalsIgnoreCase("IE")) {
//
//                System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
//
//                driver = new InternetExplorerDriver();
//
//                driver.manage().deleteAllCookies();
//
//
//            }
            }else {

                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

                driver = new ChromeDriver();

                driver.get("chrome://settings/clearBrowserData");

            }
            break;
            case SAUCE:
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
                break;
        }
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

    @AfterMethod
    public void afterActions(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            Reports.fail(driver, testResult.getName());
        }
        Reports.stop();
        //driver.quit();
    }

}
