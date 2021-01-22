import org.testng.annotations.Test;

public class RegistrationsTests extends BaseUI{

    @Test
    public void testRegistration(){
        mainPage.clickJoinButton();
        mainPage.completeFirstPartOfRegistartion();
        mainPage.completeSecondPartOfRegistartion();
    }


}
