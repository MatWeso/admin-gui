package com.wedecom.kong.admingui.ui.components;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.RouterLink;


public class NavBar extends Nav {

    private UnorderedList ul = new UnorderedList();
    private HtmlContainer brand = new Div();


    public NavBar() {

        addClassNames("navbar", "navbar-expand-lg", "navbar-dark", "bg-dark");
        ul.addClassNames("navbar-nav", "mr-auto");
        add(brand);
        add(ul);
    }


    public void addItem(RouterLink link) {
        link.addClassName("nav-link");
        ul.add(link);
    }

    public void addItem(ListItem item) {
        item.addClassName("nav-item");
        ul.add(item);
    }

    public void addBrand(HtmlContainer item) {
        item.addClassName("navbar-brand");
        this.brand.add(item);
    }


}
