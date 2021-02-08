import org.testng.annotations.Test;

public class ContactUsTest extends BaseUI{

    //Works well, except Captcha(asking to enter security code)
    @Test
    public void testContactUsPage(){
        mainPage.clickGiftsLink();
        giftPage.javaWaitSec(3);
        giftPage.clickValueOfList(Locators.FOOTER_MENU_LIST, Data.contactUs);
        contactUsPage.completeContactAdministratorForm(Data.reason, Data.userNameInput, Data.emailInput, Data.subject, Data.message);
    }
}
