package handlers;

import org.testng.Assert;

public class Verify extends Assert {

    public void match(String actual, String expected, String message){
        Assert.assertEquals(actual,expected, message);
    }

    public void match(int actual, int expected, String message){
        Assert.assertEquals(actual, expected, message);
    }

}
