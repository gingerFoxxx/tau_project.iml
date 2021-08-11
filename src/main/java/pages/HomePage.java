//Главная страница
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //METHODS:
    //1. Метод для перехода по любой ссылке на странице
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    //2. Кликнуть по ссылке "Form Authentication"
    public LoginPage clickFormAuthentification(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    //3. Кликнуть по ссылке "Dropdown"
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    //4. Кликнуть по ссылке "Forgot Password"
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    //5. Кликнуть по ссылке "Hovers"
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    //6. Кликнуть по ссылке "Key Presses"
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    //7. Кликнуть по ссылке "Horizontal Slider"
    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    //8. Кликнуть по ссылке "Horizontal Slider"
    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    //9. Кликнуть по ссылке "File Upload"
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    //10. Кликнуть по ссылке "Context Menu"
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    //11. Кликнуть по ссылке "WYSIWYG Editor"
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }
    //12. Кликнуть по ссылке "DynamicLoading"
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    //13. Кликнуть по ссылке "Large & Deep DOM"
    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    //14. Кликнуть по ссылке "Infinite Scroll"
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    //15. Кликнуть по ссылке "Multiple Windows"
    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }


}
