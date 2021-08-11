package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Text;

public class WysiwygEditorPage {
    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private  By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/button[2]/span[1]/*[1]");

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }


    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
}
