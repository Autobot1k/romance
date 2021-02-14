package com.romanceabroad.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI{

    @Test
    public void testBlog(){
        String blogLink = mainPage.verifyBlogLinkIsDisplayed();
        Assert.assertEquals(blogLink, Data.expectedUrlBlog);
        driver.navigate().to(Data.mainUrl);
    }


}
