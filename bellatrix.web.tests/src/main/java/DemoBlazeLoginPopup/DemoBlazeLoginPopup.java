package DemoBlazeLoginPopup;

import solutions.bellatrix.web.pages.WebPage;

public class DemoBlazeLoginPopup extends WebPage<LoginMap, LoginPopupAsserts> {
    @Override
    protected String getUrl() {
        return null;
    }

    @Override
    protected void waitForPageLoad() {
        map().userNameTextField().toExist().waitToBe();
    }

    public void clickClosePopup() {
        map().closePopupButton().click();
    }
}
