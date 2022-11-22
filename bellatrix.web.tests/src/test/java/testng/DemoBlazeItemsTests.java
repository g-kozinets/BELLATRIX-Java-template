package testng;

import DemoBlazeLoginPopup.DemoBlazeLoginPopup;
import DemoBlazeMainPage.DemoBlazeMainPage;
import DemoBlazeItemPage.BlazeItemPage;
import org.junit.jupiter.api.Test;
import solutions.bellatrix.web.infrastructure.Browser;
import solutions.bellatrix.web.infrastructure.ExecutionBrowser;
import solutions.bellatrix.web.infrastructure.Lifecycle;
import solutions.bellatrix.web.infrastructure.junit.WebTest;

@ExecutionBrowser(browser = Browser.CHROME_HEADLESS, lifecycle = Lifecycle.RESTART_ON_FAIL)
public class DemoBlazeItemsTests extends WebTest {

    private String url = "https://www.demoblaze.com/";

    @Test
    public void selectItemFromMainPageTest() {
        String itemToSelect = "Samsung galaxy s6";
        app().navigate().to(url);

        DemoBlazeMainPage mainPage = app().create(DemoBlazeMainPage.class);
        mainPage.clickItem(itemToSelect);

        BlazeItemPage itemPage = app().create(BlazeItemPage.class);
        itemPage.asserts().correctItemNameAppeared(itemToSelect);

    }

    @Test
    public void loginPopupIsClosableTest() {
        app().navigate().to(url);

        DemoBlazeMainPage mainPage = app().create(DemoBlazeMainPage.class);
        mainPage.clickLogin();

        DemoBlazeLoginPopup loginPopup = app().create(DemoBlazeLoginPopup.class);
        loginPopup.clickClosePopup();
        loginPopup.asserts().popIsClosed();
    }
}
