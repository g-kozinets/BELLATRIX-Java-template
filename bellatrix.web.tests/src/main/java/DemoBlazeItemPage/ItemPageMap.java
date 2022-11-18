package DemoBlazeItemPage;

import solutions.bellatrix.web.components.Label;
import solutions.bellatrix.web.pages.PageMap;

public class ItemPageMap extends PageMap {

    public Label itemInfoContainer() {
        return create().byClassContaining(Label.class, "product-content");
    }

    public Label itemNameLabel() {
        return create().byClassContaining(Label.class, "name");
    }

}
