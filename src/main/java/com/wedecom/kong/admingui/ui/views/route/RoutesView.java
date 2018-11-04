package com.wedecom.kong.admingui.ui.views.route;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.wedecom.kong.admingui.backend.services.RouteService;
import com.wedecom.kong.admingui.backend.services.model.RouteDetails;
import com.wedecom.kong.admingui.ui.MainLayout;
import com.wedecom.kong.admingui.ui.components.table.HtmlTable;
import com.wedecom.kong.admingui.ui.components.table.TableBody;
import com.wedecom.kong.admingui.ui.components.table.TableHead;
import org.assertj.core.util.Lists;

import java.util.stream.Collectors;

@SpringComponent
@UIScope
@Route(value = "route", layout = MainLayout.class)
public class RoutesView extends Div {

    private final RouteService routeService;
    private VerticalLayout listLayout = new VerticalLayout();
    EditRouteDialog editRouteDialog = new EditRouteDialog();

    public RoutesView(RouteService routeService) {
        this.routeService = routeService;
        render();
    }

    private void render() {
        add(new H2("Routes View"));


        HtmlTable table = new HtmlTable(
                new TableHead(Lists.newArrayList("ID", "Name", "Methods", "Paths")),
                new TableBody(routeService.getRoutes().stream()
                .map(r -> new RouteItem(this, r))
                .collect(Collectors.toList())));

        listLayout.add(table);


        add(listLayout);

    }

    public void edit(RouteDetails routeDetails) {
        System.out.println("Clicking: " + routeDetails.getName());
        editRouteDialog.open(routeDetails);
    }
}
