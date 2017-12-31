package screens;

import handlers.Verify;
import handlers.WebCore;
import org.openqa.selenium.WebDriver;

public class PaginaNuevaScreen extends WebCore {

    public PaginaNuevaScreen(WebDriver driver){
        super(driver);
    }

    public final static String SPACE_NAME_DROPDOWN = "//*[@id=\"mw-input-namespace\"]";

    public void selectOption(String text){
        waitHandler.forElementToBeClickable(SPACE_NAME_DROPDOWN);
        dropdown.selectByText(SPACE_NAME_DROPDOWN,text);

    }
}
