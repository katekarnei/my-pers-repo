package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StCodesPage {
    public WebDriver driver;

    public By codeLink = By.linkText("200");
    //public By statusAlert = By.tagName("h3");

    public StCodesPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCodeLink(){
        driver.findElement(codeLink).click();
    }

    //public String getAlertText(){
    //    return driver.findElement(statusAlert).getText();
    //}
}
