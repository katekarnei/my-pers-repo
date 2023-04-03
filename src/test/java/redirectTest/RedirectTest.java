package redirectTest;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.RedirectPage;
import pages.StCodesPage;

import static org.testng.Assert.assertEquals;

public class RedirectTest extends BaseTest {
    @Test
    public void redirectTest(){
        RedirectPage redirectPage = homePage.clickRedirectLink();
        redirectPage.clickHereLink();
        assertEquals(redirectPage.getAlertText(), "Status Codes","Wrong Text");

    }
}
