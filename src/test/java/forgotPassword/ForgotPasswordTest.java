package forgotPassword;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.NewForgotPage;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTest extends BaseTest {
    @Test
    public void forgotPasswordTest(){
       ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordLink();
       forgotPasswordPage.sendEmail("tau@example.com");
       NewForgotPage newForgotPage = forgotPasswordPage.clickSubmitButton();
       assertEquals(newForgotPage.getStatusText(),"Internal Server Error", "Wrong Error Message");

    }
}
