package com.wedecom.kong.admingui.ui.components.table;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Tag("tr")
@NoArgsConstructor
public class TableRow extends HtmlContainer implements ClickNotifier {

    @Getter
    private List<TableData> data;

    public TableRow(List<TableData> data) {
        this.data = data;
        setData(data);
    }

    public void setData(List<TableData> data){
        data.forEach(this::add);
        this.data = data;
    }

}
