package com.wedecom.kong.admingui.ui.components;

import com.google.common.collect.Lists;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.html.Div;
import com.wedecom.kong.admingui.ui.components.table.HtmlTable;
import com.wedecom.kong.admingui.ui.components.table.TableData;
import com.wedecom.kong.admingui.ui.components.table.TableHead;
import com.wedecom.kong.admingui.ui.components.table.TableRow;

import java.util.List;

public class GridComponent extends Div {

    List<LineItem> items;

    public GridComponent(List<LineItem> items) {
        addClassName("container");
        items.stream().map(this::setItemClass).forEach(this::add);



    }

    private HtmlContainer setItemClass(LineItem item) {
        item.addClassName("row");
        return item;
    }


}
