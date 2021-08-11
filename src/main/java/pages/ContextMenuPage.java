package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    private WebDriver driver;
    private By area = By.id("hot-spot");

    public void clickArea(){
        WebElement areaBox = driver.findElement(area);
        Actions actions = new Actions(driver);
        actions.moveToElement(areaBox).contextClick().perform();
    }
    public String getTextAlert(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
