package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {
    @Test
    public void textRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickArea();
        String text = contextMenuPage.getTextAlert();

        assertEquals(text,"You selected a context menu","Error");
        contextMenuPage.acceptAlert();
    }
}
