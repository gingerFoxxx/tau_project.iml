package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void sliderTest(){
        String value = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.moveSlider(value);
        assertEquals(sliderPage.getRange(),value, "incorrect");
    }
}
