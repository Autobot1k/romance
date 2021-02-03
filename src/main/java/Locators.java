import org.openqa.selenium.By;

public class Locators {

    //MainPage
    public static final By FIND_YOU_TUBE_VIDEO = (By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']"));
    public static final By CLICK_YOU_TUBE_VIDEO = (By.xpath("//button[@class='ytp-large-play-button ytp-button']"));
    public static final By TABS_OF_MAIN_PAGE = (By.xpath("//ul[@class='navbar-nav']//li"));
    public static final By CAPTCHA_TITLE = (By.xpath("//label[@for='captcha']"));


    //Gifts
    public static final By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");


    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By EMAIL_FIELD = By.cssSelector("input#email");
    public static final By PASSWORD_FIELD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By USERNAME_FIELD = By.cssSelector("#nickname");
    public static final By SELECT_DAY_FIELD = By.cssSelector("#daySelect");
    public static final By PICK_A_DAY = By.xpath("//li[@data-handler='selectDay']//a[text()='3']");
    public static final By SELECT_MONTH_FIELD = By.cssSelector("#monthSelect");
    public static final By PICK_A_MONTH = By.xpath("//li[@data-handler='selectMonth']//a[text()='Jun']");
    public static final By SELECT_YEAR_FIELD = By.cssSelector("#yearSelect");
    public static final By PICK_A_YEAR = By.xpath("//li[@data-handler='selectYear']//a[text()='2002']");
    public static final By PHONE_FIELD = By.cssSelector("input[name='data[phone]']");
    public static final By LOCATION_FIELD = By.xpath("//input[@name='region_name']");
    public static final By CHECKBOX_CONFIRMATION = By.cssSelector("input#confirmation");


    //How we work tab
    public static final By LINK_HOW_WE_WORK = By.xpath(" //a[@href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By HOW_WE_WORK_PAGE_TITLE = (By.xpath("//h1"));

    //Pretty Woman tab
    public static final By LINK_PRETTY_WOMEN = By.xpath("//a[@href ='https://romanceabroad.com/users/search']");
    public static final By PRETTY_WOMEN_PAGE_TITLE = (By.xpath("//h1"));
    public static final By PRETTY_WOMEN_IMAGES = (By.xpath("//a[@class='g-pic-border g-rounded']"));

    //Photos tab
    public static final By LINK_PHOTOS = By.xpath("//a[contains(text(),'PHOTOS')]");

    //Tour to Ukraine tab
    public static final By LINK_TOUR_TO_UKRAINE = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");

    //Blog tab
    public static final By LINK_BLOG = By.xpath("//a[contains(text(),'BLOG')]");

    //Sign IN tab
    public static final By LINK_SignIn = By.xpath("//a[@id='ajax_login_link']");

    //Search
    public static final By DROP_DOWN_LIST_SORT_BY = By.xpath("//div[@class='form-inline']//select");
    public static final By DROP_DOWN_LIST_AGE_MIN = By.cssSelector("#age_min");
    public static final By DROP_DOWN_LIST_AGE_MAX = By.cssSelector("#age_max");
    public static final By SEARCH_CLICK = By.cssSelector("#main_search_button_user_advanced");

    //Photos page
    public static final By PHOTO_TAB = By.xpath("//a[@href='https://romanceabroad.com/media/photo']");
    public static final By VIDEO_TAB = By.xpath("//a[@href='https://romanceabroad.com/media/video']");
    public static final By ALBUMS_TAB = By.xpath("//a[@href='https://romanceabroad.com/media/albums']");

}
