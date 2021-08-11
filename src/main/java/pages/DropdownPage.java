// Для выпадающего списка необходимо прописать Selenium support зависимости, что позволит выбрать объект
//в выпадающем списке
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver =driver;
    }

    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream() // открывает возможность производить операции над элементами списка
                .map(e->e.getText()) // получить  текст каждого элемента списка (метод для операций, есть еще filter - для фильтрации и forEach- для вывода и завершения)
                .collect(Collectors.toList());//  собрать в коллекцию текст каждого эл-та в новый лист из строк
    }

    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }
}

