package com.wedecom.kong.admingui.ui.components.table;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;

@Tag("td")
public class TableData extends HtmlContainer implements ClickNotifier {

    public TableData(String text){
        setText(text);
    }

    public TableData(Component component){
        add(component);
    }

}
