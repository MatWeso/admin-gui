package com.wedecom.kong.admingui.ui.components.table;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;

import java.util.List;

@Tag("tbody")
public class TableBody extends HtmlContainer implements ClickNotifier{

    private List<TableRow> rows;

    public TableBody(List<TableRow> rows) {
        this.rows = rows;
        rows.forEach(this::add);
    }
}
