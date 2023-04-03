package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewForgotPage {
    public WebDriver driver;
    public NewForgotPage(WebDriver driver){
        this.driver = driver;
    }
    public By statusText = By.tagName("h1");
    public String getStatusText(){
         return driver.findElement(statusText).getText();
    }
}
