package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By results = By.id("result");
    private By triggerConfirmButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By triggerPromptButton = By.xpath("//button[contains(text(),'Click for JS Prompt')]");

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept(); // accept = click to 'OK' btn on the alert
        //The switchTo method will switch from the current context of the DOM to something else.
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss(); // dismiss = click to 'CANCEL' btn on the alert
    }

    public String getResultText(){
        return driver.findElement(results).getText();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }




}
