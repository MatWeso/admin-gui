package com.wedecom.kong.admingui.ui.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

public class ClosableButton extends Button {

    public ClosableButton(String id, String value) {
        // addClassNames("btn", "btn-primary" , "btn-sm");
        setIcon(new Icon(VaadinIcon.CLOSE_SMALL));
        setIconAfterText(true);
        setId(id);
        setText(value);
        setVisible(true);
        setHeight("20");
        setWidth("80");
        getStyle().set("font-size", "9px");
    }
}
