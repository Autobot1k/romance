import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTests extends BaseUI {

    @Test
    public void testRegistration(){
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistration();
        mainPage.completeSecondPartOfRegistration();
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if(driver.findElement(Locators.CAPTCHA_TITLE).isDisplayed()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox is already selected");
        }
    }



    @Test
    public void testVideoWebElement () throws InterruptedException {
        Thread.sleep(5000);
        WebElement element = driver.findElement(Locators.FIND_YOU_TUBE_VIDEO);
        driver.switchTo().frame(element);
        driver.findElement(Locators.CLICK_YOU_TUBE_VIDEO).click();

    }

    @Test
    public void IframesMainPage(){
        int numbersOfIframes = mainPage.verifyIframeSizeFromMainPage();
        Assert.assertTrue(numbersOfIframes > 0);

    }


//    @Test
//    public void testHowWeWorkPage() {
//        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
//        currentUrlSearch = driver.getCurrentUrl();
//        System.out.println(currentUrlSearch);
//        Assert.assertEquals(currentUrlSearch, Data.expectedUrlHowWeWork);
//
//    }
//
//    @Test
//    public void testPrettyWomenPage() {
//        driver.findElements(Locators.LINK_SEARCH).get(Data.index_link_PRETTY_Women).click();
//    }
//
//    @Test
//    public void testPhotosPage() {
//        driver.findElement(Locators.LINK_PHOTOS).click();
//        currentUrlSearch = driver.getCurrentUrl();
//        System.out.println(currentUrlSearch);
//        Assert.assertEquals(currentUrlSearch, Data.expectedUrlPhotos);
//    }
//
//    @Test
//    public void testTourToUkrainePage() {
//        currentTitleSearch = driver.findElement(Locators.LINK_TOUR_TO_UKRAINE).getText();
//        System.out.println(currentTitleSearch);
//        Assert.assertEquals(currentTitleSearch, Data.expectedTabTitle);
//    }
//
//    @Test
//    public void testBlogPage() {
//        driver.findElement(Locators.LINK_BLOG).click();
//        currentTitleSearch = driver.getTitle();
//        System.out.println(currentTitleSearch);
//        Assert.assertEquals(currentTitleSearch, Data.expectedTitleBlog);
//    }
//
//    @Test
//    public void testSignInPage() {
//        WebElement linkSignIn = driver.findElement(Locators.LINK_SignIn);
//        linkSignIn.click();
//    }

}


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


