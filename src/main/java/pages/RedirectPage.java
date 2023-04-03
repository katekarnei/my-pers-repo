package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedirectPage {
    public WebDriver driver;
    public By hereLink = By.id("redirect");

    public By statusAlert = By.tagName("h3");

    public RedirectPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickHereLink(){
        driver.findElement(hereLink).click();
    }

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
