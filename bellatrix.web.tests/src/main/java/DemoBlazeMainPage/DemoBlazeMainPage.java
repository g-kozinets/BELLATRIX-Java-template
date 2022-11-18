package DemoBlazeMainPage;

import solutions.bellatrix.web.pages.WebPage;

public class DemoBlazeMainPage extends WebPage<MainPageMap, Asserts> {
    @Override
    protected String getUrl() {
        return "https://www.demoblaze.com/";
    }

    @Override
    protected void waitForPageLoad() {
        map().carouselLabel().toExist().waitToBe();
    }

    public void clickItem(String itemName) {
        map().itemButtonByName(itemName).click();
    }

    public void clickLogin() {
        map().loginButton().click();
    }
}
