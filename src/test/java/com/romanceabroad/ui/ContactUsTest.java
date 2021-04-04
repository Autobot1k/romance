package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(VideoListener.class)

public class ContactUsTest extends BaseUI{

    //Works well, except Captcha(asking to enter security code)
    @Video(name = "ContactUs test")
    @Test
    public void testContactUsPage(){
        mainPage.clickGiftsLink();
        giftPage.javaWaitSec(3);
        giftPage.clickValueOfList(Locators.FOOTER_MENU_LIST, Data.contactUs);
        Assert.assertTrue(contactUsPage.titleContainsContactAdministrator());
        contactUsPage.completeContactAdministratorForm(Data.reason, Data.userNameInput, Data.emailInput, Data.subject, Data.message);
    }
}
