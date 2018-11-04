package com.wedecom.kong.admingui.ui.components;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.html.Div;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LineItem extends Div {

    @Setter @Getter
    List<HtmlContainer> columns = new ArrayList<>();

    public LineItem() {

        addClassNames("row", "border", "border-dark", "p-1", "m-1");


    }

    public void setColumns(List<HtmlContainer> l){
        this.columns = l.stream().peek(a -> a.addClassName("col")).peek(this::add).collect(Collectors.toList());

    }



}
