package inputstest;

import basetest.BaseTest;
import org.testng.annotations.Test;
import pages.InputsPage;

public class InputsTest extends BaseTest {
    @Test
    public void testInputsForm(){
        InputsPage inputsPage = homePage.clickInputsLink();
        inputsPage.inputNumber("2234");
    }
}
