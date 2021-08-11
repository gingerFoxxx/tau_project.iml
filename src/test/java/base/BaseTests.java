package base;
/**
 * Kind of WebDrivers (interfaces):
 * - ChromeDriver, which we'll use
 * - EdgeDriver for the Edge browser
 * - FirefoxDriver
 * - InternetExplorerDriver
 * - OperaDriver
 * - SafariDriver
 * - RemoteWebDriver
 */

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        //driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS); - Неявные ожидания
        goHome();
        setCookie();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            // System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }

    //Webdriver extras
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars"); // disable info bars into browser
        //options.setHeadless(true); //no browser has opened
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }
    public CookieManager getCookieManager(){
        return new CookieManager(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
