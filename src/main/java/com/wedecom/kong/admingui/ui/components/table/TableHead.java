package com.wedecom.kong.admingui.ui.components.table;

import com.vaadin.flow.component.ClickNotifier;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;

import java.util.List;
import java.util.stream.Collectors;

@Tag("thead")
public class TableHead extends HtmlContainer implements ClickNotifier {

    private List<String> headerNames;

    public TableHead(List<String> headerNames) {
        this.headerNames = headerNames;
        add(new Tr(headerNames));

    }


    @Tag("th")
    private class Th extends HtmlContainer {

        public Th(String name) {
            setText(name);
        }

    }

    @Tag("tr")
    private class Tr extends HtmlContainer {

        private List<String> headerNames;
        private List<Th> ths;

        public Tr(List<String> headerNames) {
            this.headerNames = headerNames;
            ths = headerNames.stream()
                    .map(Th::new)
                    .peek(this::add)
                    .collect(Collectors.toList());

        }
    }

}
