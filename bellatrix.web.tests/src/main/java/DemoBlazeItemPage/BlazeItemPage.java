package DemoBlazeItemPage;

import solutions.bellatrix.web.pages.WebPage;

public class BlazeItemPage extends WebPage<ItemPageMap, ItemPageAsserts> {
    @Override
    protected String getUrl() {
        return "https://www.demoblaze.com/";
    }

    @Override
    protected void waitForPageLoad() {
        map().itemInfoContainer().toExist().waitToBe();
    }

    public String getItemName() {
        return map().itemNameLabel().getText();
    }
}
