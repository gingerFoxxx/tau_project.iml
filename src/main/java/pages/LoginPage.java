// HomePage - > LoginPage
// Страница после перехода по ссылке "Form Authentication"
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //FIELDS:
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//i[contains(text(),'Login')]");

    //METHODS:
    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
