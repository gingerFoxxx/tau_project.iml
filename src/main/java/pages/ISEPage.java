package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ISEPage {
    public ISEPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By message = By.xpath("//body//h1");

    public String getMessage(){
        return driver.findElement(message).getText();
    }

}
