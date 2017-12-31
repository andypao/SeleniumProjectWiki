package handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Verify extends Assert {

    private WebDriver driver;

    public Verify(WebDriver driver){
        this.driver = driver;
    }

    public void match(String actual, String expected, String message){
        Assert.assertEquals(actual,expected, message);
    }

    public void match(int actual, int expected, String message){
        Assert.assertEquals(actual, expected, message);
    }

    public void elementIsDisplayed(String xpath, String message){
        boolean flag = false;
        try{
            driver.findElement(By.xpath(xpath));
            flag = true;
        }catch(NotFoundException e){
            flag = false;
        }
        Assert.assertTrue(flag,message);
    }

    public void elementNotDisplayed(String xpath, String message){
        boolean flag = false;
        try{
            driver.findElement(By.xpath(xpath));
            flag = true;
        }catch(NotFoundException e){
            flag = false;
        }
        Assert.assertFalse(flag,message);
    }
}
