package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(VideoListener.class)

public class BlogTest extends BaseUITestWithSauceLabs{

    @Video(name = "Blog test")
    @Test
    public void testBlog(){
        String blogLink = mainPage.verifyBlogLinkIsDisplayed();
        Assert.assertEquals(blogLink, Data.expectedUrlBlog);
        driver.navigate().to(Data.mainUrl);
    }

}
