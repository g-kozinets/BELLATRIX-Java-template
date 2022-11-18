package DemoBlazeMainPage;

import solutions.bellatrix.web.components.Button;
import solutions.bellatrix.web.components.Label;
import solutions.bellatrix.web.pages.PageMap;

public class MainPageMap extends PageMap {

    public Label carouselLabel() {
        return create().byClassContaining(Label.class, "carousel-item");
    }

    public Button itemButtonByName(String name) {
        String locator = String.format("//div[contains(@class, 'card')]//*[text()='%s']", name);
        return create().byXPath(Button.class, locator);
    }

    public Button loginButton() {
        return create().byId(Button.class, "login2");
    }


}
