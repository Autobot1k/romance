package com.romanceabroad.ui;

import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(VideoListener.class)

public class BlogTest2 extends BaseUI{

    String blogLink;

    @Video(name = "Blog2 test")
    @Test
    public void testBlog(){
        blogLink = mainPage.verifyBlogLinkIsDisplayed();
        Assert.assertEquals(blogLink, Data.expectedUrlBlog);
        driver.navigate().to(Data.mainUrl);
    }
}
