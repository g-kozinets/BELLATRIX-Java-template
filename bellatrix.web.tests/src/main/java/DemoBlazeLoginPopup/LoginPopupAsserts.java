package DemoBlazeLoginPopup;

import solutions.bellatrix.web.pages.PageAsserts;

public class LoginPopupAsserts extends PageAsserts<LoginMap> {

    public void popIsClosed() {
        map().userNameTextField().validateNotDisabled();
    }
}
