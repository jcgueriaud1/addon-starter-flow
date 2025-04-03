package org.vaadin.addons.mygroup;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;

@CssImport("./the-addon.css")
public class TheAddon extends Div {

    public TheAddon() {
        setText("Hello");
        addClassName("test-css");
    }
}
