package screens;

import handlers.WebCore;
import org.openqa.selenium.WebDriver;

public class PortadaScreen extends WebCore {

    public PortadaScreen(WebDriver driver){
        super(driver);
        System.out.println("screen class instantiated ");
    }

    public final static String SEARCH_BOX = "//input[@id='searchInput']";
    public final static String PORTADA_TAB = "//span/a[contains(.,'Portada')]";
    public final static String PAGINAS_NUEVAS_LINK = "//li[@id='n-newpages']/a";

    public void enterSearchCriteria(String text){
        sendText(SEARCH_BOX,text);
    }

    public boolean isPortadaTabDisplayed(){
        return isElementDisplayed(PORTADA_TAB);
    }

    public PaginaNuevaScreen goToPaginasNuevas(){
        click(PAGINAS_NUEVAS_LINK);
        return new PaginaNuevaScreen(driver);
    }

}
