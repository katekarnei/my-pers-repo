package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsPage {

    public WebDriver driver;
    public By formInput = By.cssSelector("#content > div > div > div > input[type=number]");

    public InputsPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputNumber(String numbers){
        driver.findElement(formInput).sendKeys(numbers);
    }
}
