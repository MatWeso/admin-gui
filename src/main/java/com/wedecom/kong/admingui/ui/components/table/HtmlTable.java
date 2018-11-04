package com.wedecom.kong.admingui.ui.components.table;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;

@Tag("table")
public class HtmlTable extends HtmlContainer implements ClickNotifier {

    private TableHead head;
    private TableBody body;


    public HtmlTable(TableHead head, TableBody body){
        this.head = head;
        this.body = body;

        render();
    }

    private void render() {

        addClassNames("table", "table-hover");
        add(head);
        add(body);

    }

}
