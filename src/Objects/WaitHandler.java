package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandler {

    private WebDriverWait wait;

    public WaitHandler(WebDriver driver){
        wait = new WebDriverWait(driver,10);
    }

    public WaitHandler(WebDriver driver,int timeOut){
        wait = new WebDriverWait(driver,timeOut);
    }

    public boolean forElementToBeClickable(String xpath){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
            return true;
        }catch(TimeoutException e){
            return false;
        }
    }

    /**
     * Checks for an element to be visible in the page.
     * @param xpath
     * @return
     */
    public boolean forElementToBeVisible(String xpath){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return true;
        }catch(TimeoutException e){
            return false;
        }
    }

    /**
     * Checks for an element to be present on the page. It can be hidden.
     * @param xpath
     * @return
     */
    public boolean forElementToBePresent(String xpath){
        try{
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            return true;
        }catch(TimeoutException e){
            return false;
        }
    }

    /**
     * Checks for some text to be contained within the specified element.
     * @param xpath
     * @param text
     * @return
     */
    public boolean forTextToBePresentInElement(String xpath, String text){
        try{
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(xpath),text));
            return true;
        }catch(TimeoutException e){
            return false;
        }
    }

    /**
     * Checks for some text to be present within the value attribute of some element.
     * @param xpath
     * @param text
     * @return
     */
    public boolean forValueToBePresentInElement(String xpath, String text){
        try{
            wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(xpath),text));
            return true;
        }catch(TimeoutException e){
            return false;
        }
    }
}
