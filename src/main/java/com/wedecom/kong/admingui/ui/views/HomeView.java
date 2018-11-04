package com.wedecom.kong.admingui.ui.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.router.Route;
import com.wedecom.kong.admingui.ui.MainLayout;

@Route(value = "", layout = MainLayout.class)
public class HomeView extends Div {

    public HomeView() {
        add(new H2("Das ist die Home view"));
    }

}
