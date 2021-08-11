package passwords;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {
    @Test
      public void testRetrievePassword(){
        var forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("tau@example.com");
        var isePage = forgotPasswordPage.clickRetrieveButton();
        assertEquals(isePage.getMessage(), "Internal Server Error", "Error!");
    }
}
