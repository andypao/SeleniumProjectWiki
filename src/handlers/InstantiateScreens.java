package handlers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import screens.PaginaNuevaScreen;
import screens.PortadaScreen;

public class InstantiateScreens extends WebCore{

    protected PortadaScreen portadaScreen;
    protected PaginaNuevaScreen paginaNuevaScreen;
    private WebDriver driver;
    private WebDriverHandler driverHandler;
    protected Verify verify;

    public InstantiateScreens(){
        driverHandler =  new WebDriverHandler();
        driver = driverHandler.setUp();
        verify = new Verify(driver);
    }

    @BeforeClass
    public void setUp(){
        driver.get("https://es.wikipedia.org/wiki/Especial:P%C3%A1ginasNuevas");
        initiateClasses();
    }

    private void initiateClasses(){
        portadaScreen = new PortadaScreen(driver);
        paginaNuevaScreen = new PaginaNuevaScreen(driver);
    }

    @AfterClass
    public void quitDriver(){
        driverHandler.close(driver);
    }
}
