package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrieveButton = By.id("form_submit");

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public ISEPage clickRetrieveButton (){
        driver.findElement(retrieveButton).click();
        return new ISEPage(driver);
    }

}
