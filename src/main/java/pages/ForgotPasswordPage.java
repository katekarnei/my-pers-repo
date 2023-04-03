package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    public WebDriver driver;
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public By emailForm = By.id("email");
    public By submitButton = By.id("form_submit");
    public void sendEmail(String email){
        driver.findElement(emailForm).sendKeys(email);
    }

    public NewForgotPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new NewForgotPage(driver);
    }


}
