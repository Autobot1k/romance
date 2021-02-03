import org.testng.Assert;
import org.testng.annotations.Test;

public class BlogTest extends BaseUI{

    @Test
    public void testBlog(){
        String blogLink = blogPage.verifyBlogLinkIsDisplayed();
        Assert.assertEquals(blogLink, Data.expectedUrlBlog);
        driver.navigate().to(Data.mainUrl);
    }


}
