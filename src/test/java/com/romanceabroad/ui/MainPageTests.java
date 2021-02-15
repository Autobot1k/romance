package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTests extends BaseUI{


    //Sometimes it doesn't click confirmation checkbox for the 2nd modal window in every browser during registration, but sometimes it works!

    @Test(dataProvider = "Registration", dataProviderClass = DataProviders.class)
    public void testRegistration(String email, String password, String day, String month, String year, String phone, String city ,String location) {
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, password);
        mainPage.clickButtonNext();
        mainPage.completeSecondPartOfRegistration(BaseActions.generateNewNumber(Data.userNameInput, 10), day,
                month, year, phone, city, location);
        mainPage.clickCheckBoxConfirmation();
    }

    @Test(dataProvider = "Registration2", dataProviderClass = DataProviders.class)
    public void testRegistration2(String email, String nickname, boolean requirement) {
        System.out.println(email);
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration(email, Data.passwordInput);
        if(!requirement) {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR).isDisplayed());
        }else{
            mainPage.clickButtonNext();
            mainPage.completeSecondPartOfRegistration(nickname, Data.day,
                    Data.month, Data.year, Data.phone, Data.location, Data.specific_location);
        }


//    @Test(dataProvider = "Sign In", dataProviderClass = DataProviders.class)
//    public void testSignIn(String email, String password){
//        System.out.println(email);
//        System.out.println(password);
//        mainPage.clickSignInTab();
//
//        mainPage.clickButtonSignIn();
//
//        }

    }

//    @Test()
//    public void testVideoWebElement() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.switchTo().frame(mainPage.findVideoOnMainPage());
//        mainPage.clickVideoOnMainPage();
//
//    }
//
//    @Test
//    public void IframesMainPage() {
//        int numbersOfIframes = mainPage.verifyIframeSizeFromMainPage();
//        Assert.assertTrue(numbersOfIframes > 0);
//
//    }
//
//    @Test
//    public void testLinksOnMainPage() {
//        mainPage.checkLinksOnWebPage("//a", "href");
//        mainPage.checkLinksOnWebPage("//img", "src");
////        driver.findElement(com.romanceabroad.ui.Locators.LINK_PRETTY_WOMEN).click();
////        mainPage.checkLinksOnWebPage("//a", "href");
////        mainPage.checkLinksOnWebPage("//img", "src");
//    }
//
//    @Test
//    public void testAjaxSendKeys() {
//        mainPage.clickJoinButton();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        mainPage.ajaxSendKeys(mainPage.emailField(), "aaa@gmail.com");
//        wait.until(ExpectedConditions.visibilityOf(mainPage.passwordField()));
//        mainPage.ajaxSendKeys(mainPage.passwordField(), "123456789");
//        mainPage.clickButtonNext();
//    }
//
//    @Test
//    public void smokeTestOfMainPage() {
//        int tabs = mainPage.getMainTabs().size();
//        System.out.println(tabs);
//        for (int i = 0; i < tabs; i++) {
//            info = mainPage.getMainTabs().get(i).getText();
//            System.out.println(info);
//            mainPage.getMainTabs().get(i).click();
//            driver.get(com.romanceabroad.ui.Data.mainUrl);
//            mainPage.getMainTabs();
//
//        }
//
//    }
}





//    @Test
//    public void testHowWeWorkPage() {
//        driver.findElement(com.romanceabroad.ui.Locators.LINK_HOW_WE_WORK).click();
//        currentUrlSearch = driver.getCurrentUrl();
//        System.out.println(currentUrlSearch);
//        Assert.assertEquals(currentUrlSearch, com.romanceabroad.ui.Data.expectedUrlHowWeWork);
//
//    }
//
//    @Test
//    public void testPrettyWomenPage() {
//        driver.findElements(com.romanceabroad.ui.Locators.LINK_SEARCH).get(com.romanceabroad.ui.Data.index_link_PRETTY_Women).click();
//    }
//
//    @Test
//    public void testPhotosPage() {
//        driver.findElement(com.romanceabroad.ui.Locators.LINK_PHOTOS).click();
//        currentUrlSearch = driver.getCurrentUrl();
//        System.out.println(currentUrlSearch);
//        Assert.assertEquals(currentUrlSearch, com.romanceabroad.ui.Data.expectedUrlPhotos);
//    }
//
//    @Test
//    public void testTourToUkrainePage() {
//        currentTitleSearch = driver.findElement(com.romanceabroad.ui.Locators.LINK_TOUR_TO_UKRAINE).getText();
//        System.out.println(currentTitleSearch);
//        Assert.assertEquals(currentTitleSearch, com.romanceabroad.ui.Data.expectedTabTitle);
//    }
//
//    @Test
//    public void testBlogPage() {
//        driver.findElement(com.romanceabroad.ui.Locators.LINK_BLOG).click();
//        currentTitleSearch = driver.getTitle();
//        System.out.println(currentTitleSearch);
//        Assert.assertEquals(currentTitleSearch, com.romanceabroad.ui.Data.expectedTitleBlog);
//    }
//
//    @Test
//    public void testSignInPage() {
//        WebElement linkSignIn = driver.findElement(com.romanceabroad.ui.Locators.LINK_SignIn);
//        linkSignIn.click();
//    }




// 10 xPaths with 2 attributes:

//1. For "Home" web-element: //a[@href='#'][@class='nav-link']
//2. For YouTube play button web-element: //button[@class='ytp-large-play-button ytp-button'][@aria-label='Play']
//3. For "Request Tour Info" web-element: //a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc'][@target='_blank']
//4. For Picture from carousel on com.romanceabroad.ui.MainPage web-element: //img[@class=' img-fluid'][@src='/img/portfolio/slideimg12.jpg']
//5. For "Join Today" web-element: //a[@href='#'][@data-action='show-registration-block']
//6. For "Facebook" web-element: //a[@href='https://m.facebook.com/RomanceAbroad/?ref=bookmarks'][@target='_blank']
//7. For "Sign In" button after clicking "SIGN IN" link: //button[@class='btn btn-primary'][@type='submit']
//8. For "Login" web-element on Blog page: //a[@id='ajax_login_link'][@href='javascript:void(0);']
//9. For "Find People" web-element on Blog page: //button[@id='main_search_button_user_line'][@class='btn btn-primary btn-white']
//10. For "Privacy" web-element on Blog page: //a[@id='footer_footer-menu-policy-item_footer-menu-privacy-item'][@href='https://romanceabroad.com/content/view/privacy-and-security']


// 10 xPaths with 2 parents:

//1. For "How We Work" web-element: //li[@class='nav-item']//a[@href='https://romanceabroad.com/content/view/how-it-works']
//2. For "Join for free now" web-element: //div[@class='continue-block']//button[@id='show-registration-block']
//3. For "Search" web-element on "Tour to Ukraine" page: //div[@class='continue-block']//button[@id='show-registration-block']
//4. For "Categories" web-element on "Tour to Ukraine" page: //div[@class='input-group input-group no-padding-left']//span[@id='categories']
//5. For "Spa" web-element on "Gifts" page: //div[@class='info']//a[@href='https://romanceabroad.com/store/sweets/2-massage_spa']
//6. For "Quick view" web-element for "Teddy Bear" on "Gifts" page: //div[@id='product_quick_view_11']//input[@class='btn btn-primary']
//7. For "Menu Item" web-element for on "Gifts" page: //div[@class='menu-item']//a[@class='uam-top link-open-menu btn-slide']
//8. For "Register" link after clicking "SIGN IN" link: //div[@class='col-xs-12']//a[@href='javascript:;']
//9. For "Heart Logo" web-element on "How we work" page: //div[@class='logo-mobile-version top-menu-item']//a[@href='https://romanceabroad.com/']
//10. For "Advertising" web-element on "How we work" page: //div[@class='info-menu-inner']//a[@href='https://romanceabroad.com/content/view/advertising']












// 10 xPaths:

//1. For "Home" web-element: //a[contains(text(),'HOME')] OR //a[@href='#'][@class='nav-link']
//2. For "How we work" web-element: //a[@href='https://romanceabroad.com/content/view/how-it-works']
//3. For "Join for FREE" web-element: //button[@id='show-registration-block'] or //button[contains(text(), 'JOIN FOR FREE')]
//4. For "Photos" web-element: //a[contains(text(),'PHOTOS')]
//5. For "Gifts" web-element:  //a[@href='https://romanceabroad.com/store/category-sweets']
//6. For "Blog" web-element: //a[@href='https://romanceabroad.com/content/view/blog'] or //*[contains(text(),'BLOG')]
//7. For "Sign In" web-element:  //a[@id='ajax_login_link'] or //a[contains(text(), 'SIGN IN')]
//8. For "Request Tour Info" web-element: //a[contains(text(),'REQUEST TOUR INFO')] or //a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']
//9. For "Join Today" web-element: //a[contains(text(),'JOIN TODAY')]
//10. For "Book Now" web-element: //div/a[@href='https://romanceabroad.com/store/sweets/20-tour_to_ukraine']
//11. For "Pretty Women" web-element: //a[@href ='https://romanceabroad.com/users/search']


// 10 css selectors:

//1. For "Home" web-element:  a[href='#'][class='nav-link']
//2. For "Main NavBar" web-element:  #mainNav
//3. For "Join for free now" web-element: #show-registration-block
//4. For "News" web-element:  #footer_footer-menu-about-item_footer-menu-news-item
//5. For "Login" web-element:  #ajax_login_link
//6. For "Find people" web-element:  #main_search_button_user_line
//7. For "Privacy" web-element: #footer_footer-menu-policy-item_footer-menu-privacy-item
//8. For "Polls" web-element:  #user_guest-main-polls-item
//9. For "Request Tour Info" web-element:  a[href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']
//10. For "FIND YOUR LOVE, YOUR WIFE, YOUR DREAM!" web-element:  p.text-faded.mb-5


