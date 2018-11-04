package com.wedecom.kong.admingui.ui;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;
import com.wedecom.kong.admingui.ui.components.GridComponent;
import com.wedecom.kong.admingui.ui.components.NavBar;
import com.wedecom.kong.admingui.ui.views.HomeView;
import com.wedecom.kong.admingui.ui.views.route.RoutesView;

/**
 * The main layout contains the header with the navigation buttons, and the child views below that.
 */
@HtmlImport("frontend://styles/shared-styles.html")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
public class MainLayout extends Div implements RouterLayout, AfterNavigationObserver, PageConfigurator {


    private RouterLink home;
    private RouterLink routes;

    public MainLayout() {

        home = new RouterLink("Home", HomeView.class);
        routes = new RouterLink("Routes", RoutesView.class);

        NavBar navBar = new NavBar();

        navBar.addItem(home);
        navBar.addItem(routes);
        navBar.addBrand(new H2("LOGO"));

        add(navBar);

        addClassName("container");

    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

    }

    @Override
    public void configurePage(InitialPageSettings settings) {

    }
}
