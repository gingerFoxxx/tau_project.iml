package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Results text incorrect");
    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();

        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text = "TAU rocks!";
        alertPage.alert_setInput(text);
        alertPage.alert_clickToAccept();

        assertEquals(alertPage.getResultText(), "You entered: " + text, "Results text incorrect");
    }
}
