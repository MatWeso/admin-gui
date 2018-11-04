package com.wedecom.kong.admingui.ui.views.route;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.wedecom.kong.admingui.backend.services.model.RouteDetails;
import com.wedecom.kong.admingui.ui.components.table.TableData;
import com.wedecom.kong.admingui.ui.components.table.TableRow;
import org.assertj.core.util.Lists;

import java.util.List;

public class RouteItem extends TableRow {

    private RoutesView view;
    private RouteDetails route;
    private Button editBtm = new Button(new Icon(VaadinIcon.EDIT));

    public RouteItem(RoutesView view, RouteDetails route){

        this.view = view;
        this.route = route;

        List l = Lists.newArrayList(
                new TableData(route.getId()),
                new TableData(route.getName()),
                new TableData(route.getMethods().toString()),
                new TableData(route.getPaths().toString()),
                new TableData(editBtm)
                );

        editBtm.addClickListener(e -> view.edit(route));
        setData(l);

    }

    private void edit() {
        System.out.println("Edit clicked");

    }

    private Div createItem(String value){
        Div d = new Div();
        d.setText(value);

        return d;
    }

}
