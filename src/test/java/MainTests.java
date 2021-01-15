import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainTests extends BaseUI {
    String currentTitleSearch;
    String expectedTabTitle = "TOUR TO UKRAINE";
    String expectedTitleBlog = "Blog";
    String expectedUrlHowWeWork = "https://romanceabroad.com/content/view/how-it-works";
    String expectedUrlFindPeople = "https://romanceabroad.com/users/search";
    String expectedUrlPhotos = "https://romanceabroad.com/media/index";

    By LINK_HOW_WE_WORK = By.xpath(" //a[@href='https://romanceabroad.com/content/view/how-it-works']");
    By LINK_FIND_People = By.cssSelector("#main_search_button_user_line");
    By LINK_PRETTY_Women = By.xpath("//a[@href ='https://romanceabroad.com/users/search']");
    By LINK_PHOTOS = By.xpath("//a[contains(text(),'PHOTOS')]");
    By LINK_TOUR_TO_UKRAINE = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");
    By LINK_BLOG = By.xpath("//*[contains(text(),'BLOG')]");
    By LINK_SignIn = By.xpath("//a[@id='ajax_login_link']");

    int index_link_PRETTY_Women = 0;


    @Test
    public void testHowWeWorkPage() {
        driver.findElement(LINK_HOW_WE_WORK).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlHowWeWork);
        driver.findElement(LINK_FIND_People).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlFindPeople);
    }

    @Test
    public void testPrettyWomenPage() {
        driver.findElements(LINK_PRETTY_Women).get(index_link_PRETTY_Women).click();
    }

    @Test
    public void testPhotosPage() {
        driver.findElement(LINK_PHOTOS).click();
        currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, expectedUrlPhotos);
    }

    @Test
    public void testTourToUkrainePage() {
        currentTitleSearch = driver.findElement(LINK_TOUR_TO_UKRAINE).getText();
        System.out.println(currentTitleSearch);
        Assert.assertEquals(currentTitleSearch, expectedTabTitle);
    }

    @Test
    public void testBlogPage() {
        driver.findElement(LINK_BLOG).click();
        currentTitleSearch = driver.getTitle();
        System.out.println(currentTitleSearch);
        Assert.assertEquals(currentTitleSearch, expectedTitleBlog);
    }

    @Test
    public void testSignInPage() {
        WebElement linkSignIn = driver.findElement(LINK_SignIn);
        linkSignIn.click();
    }

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


