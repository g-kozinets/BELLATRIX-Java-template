package DemoBlazeItemPage;

import solutions.bellatrix.web.pages.PageAsserts;

public class ItemPageAsserts extends PageAsserts<ItemPageMap> {

    public void correctItemNameAppeared(String nameToCheck) {
        map().itemNameLabel().validateTextIs(nameToCheck);
    }
}
