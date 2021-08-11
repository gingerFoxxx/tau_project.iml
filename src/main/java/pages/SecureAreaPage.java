// HomePage - > LoginPage - > SecureAreaPage
// Страница после перехода по нажатию на кнопку clickLoginButton
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    //ALERT:
    private By statusAlert = By.id("flash");

    //METHODS:
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
