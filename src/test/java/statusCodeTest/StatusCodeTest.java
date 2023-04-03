package statusCodeTest;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.StCodesPage;

public class StatusCodeTest extends BaseTest {
    @Test
    public void testStatusCodeClicking(){
        StCodesPage stCodesPage = homePage.clickstatusCodesLink();
        stCodesPage.clickCodeLink();

    }


}
