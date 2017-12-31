package tests;

import handlers.InstantiateScreens;
import org.testng.asserts.Assertion;
import screens.PaginaNuevaScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends InstantiateScreens {

    @Test
    public void testSearch(){
        portadaScreen.enterSearchCriteria("Hello");
    }

    @Test
    public void testPortadaTab(){
        Assert.assertTrue(portadaScreen.isPortadaTabDisplayed());
    }

    @Test
    public void testSelectSpaceName(){
        PaginaNuevaScreen paginaNueva = portadaScreen.goToPaginasNuevas();
        paginaNueva.selectOption("Usuario");
    }
}
