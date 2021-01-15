import org.openqa.selenium.By;

public class Locators {

    //Gifts
    public static final By LINK_GIFTS = By.xpath("//a[@href='https://romanceabroad.com/store/category-sweets']");


    //Registration
    public static final By BUTTON_REGISTRATION = By.xpath("//button[@id='show-registration-block']");
    public static final By EMAIL_FIELD = By.cssSelector("input#email");
    public static final By PASSWORD_FIELD = By.cssSelector("input#password");
    public static final By BUTTON_NEXT = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By USERNAME_FIELD = By.cssSelector("#nickname");
    public static final By PHONE_FIELD = By.cssSelector("input[name='data[phone]']");
}
