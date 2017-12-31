package handlers;

import Objects.Dropdown;
import Objects.WaitHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebCore {

    protected WebDriver driver;
    protected Dropdown dropdown;
    protected WaitHandler waitHandler;

    public WebCore(){}

    public WebCore(WebDriver driver){
        this.driver = driver;
        dropdown = new Dropdown(driver);
        waitHandler = new WaitHandler(driver);
        System.out.println("Web core instance");
    }

    public void click(String xpath){
        this.driver.findElement(By.xpath(xpath)).click();
    }

    public void click(WebElement element){
        element.click();
    }

    public void sendText(String xpath, String value){
        this.driver.findElement(By.xpath(xpath)).sendKeys(value);
    }

    /** This can be used to return false / true along with an assertion
     *
     * @param xpath
     * @return
     */
    public boolean isElementDisplayed(String xpath){
        try{
            this.driver.findElement(By.xpath(xpath));
            return true;
        }catch (NotFoundException e){
            return false;
        }
    }

    public WebElement getElement(String xpath){
        return this.driver.findElement(By.xpath(xpath));
    }

}
