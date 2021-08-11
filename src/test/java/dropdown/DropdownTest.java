package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTests {
    @Test
    public void testSelectedOption(){
        var dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropdown("Option 1");
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");//Проверка что выбрано одно значение (selectedOptions.size() - дает кол-во выбранных значений, ожидаемое кол-во = 1.)

        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        assertTrue(selectedOptions.contains(option), "Option is not selected"); // Проверка есть ли в листе значение "Option 1"
    }
}
