package DemoBlazeLoginPopup;

import solutions.bellatrix.web.components.Button;
import solutions.bellatrix.web.components.TextField;
import solutions.bellatrix.web.pages.PageMap;

public class LoginMap extends PageMap {

    public TextField userNameTextField() {
        return create().byId(TextField.class, "loginusername");
    }

    public Button closePopupButton() {
        return create().byXPath(Button.class, "//*[@id='logInModal']//button[text()='Close']");
    }
}
