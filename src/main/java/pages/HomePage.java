package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public By statusCodesLink = By.linkText("Status Codes");
    public By inputsLink = By.linkText("Inputs");
    public By redirectionLink = By.linkText("Redirect Link");
    public By forgotPasswordLink = By.linkText("Forgot Password");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

public StCodesPage clickstatusCodesLink(){
        driver.findElement(statusCodesLink).click();
        return new StCodesPage(driver);
}

public InputsPage clickInputsLink(){
        driver.findElement(inputsLink).click();
        return new InputsPage(driver);
}

public RedirectPage clickRedirectLink(){
        driver.findElement(redirectionLink).click();
        return new RedirectPage(driver);
}

public ForgotPasswordPage clickForgotPasswordLink(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
}
}
