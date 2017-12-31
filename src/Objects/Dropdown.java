package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {

    private WebDriver driver;

    public Dropdown(WebDriver driver){
        this.driver = driver;
    }

    public void selectByText(String xpath, String text){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select obj = new Select(element);
        obj.selectByVisibleText(text);
    }

    public void selectByValue(String xpath, String value){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select obj = new Select(element);
        obj.selectByValue(value);
    }

    public String getSelectedText(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select obj = new Select(element);
        return obj.getFirstSelectedOption().getText();
    }

    public List<String> getListOfOptions(String xpath){
        WebElement element = driver.findElement(By.xpath(xpath));
        Select obj = new Select(element);
        List<String> optionText = new ArrayList<>();
        obj.getOptions().stream().forEach(option -> optionText.add(option.getText()));
        return optionText;
    }
}
