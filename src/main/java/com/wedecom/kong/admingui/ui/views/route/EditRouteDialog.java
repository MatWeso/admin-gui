package com.wedecom.kong.admingui.ui.views.route;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.shared.Registration;
import com.wedecom.kong.admingui.backend.services.model.RouteDetails;
import com.wedecom.kong.admingui.ui.components.ClosableButton;

import java.util.stream.Stream;

public class EditRouteDialog extends Dialog {


    private final Button saveButton = new Button("Save");
    private final Button cancelButton = new Button("Cancel");
    private final Button deleteButton = new Button("Delete");

    private final FormLayout formLayout = new FormLayout();
    private final HorizontalLayout buttonBar = new HorizontalLayout(saveButton, cancelButton, deleteButton);

    private Binder<RouteDetails> binder = new Binder<>();

    private RouteDetails currentItem;
    private Registration registrationForSave;


    private TextField name = new TextField();


    public EditRouteDialog() {
        initFormLayout();
        initButtonBar();
        setCloseOnEsc(true);
        setCloseOnOutsideClick(false);

        initFields();

    }

    private void initFields() {
        name.setLabel("Name of the route");
        name.setRequired(true);
        formLayout.add(name);
        binder.forField(name).bind(RouteDetails::getName, RouteDetails::setName);


    }

    private void initFormLayout() {
        formLayout.setResponsiveSteps(new FormLayout.ResponsiveStep("0", 1),
                new FormLayout.ResponsiveStep("25em", 3));
        Div div = new Div(formLayout);

        add(div);
    }

    private void initButtonBar() {
        saveButton.setAutofocus(true);
        saveButton.getElement().setAttribute("theme", "primary");

        cancelButton.addClickListener(e -> close());

        deleteButton.addClickListener(e -> deleteClicked());
        deleteButton.getElement().setAttribute("theme", "error");

        buttonBar.setClassName("btn btn-primary");
        buttonBar.setSpacing(true);
        add(buttonBar);
    }

    /**
     * Opens the given item for editing in the dialog.
     *
     * @param item
     *            The item to edit; it may be an existing or a newly created
     *            instance
     */
    public final void open(RouteDetails item) {
        currentItem = item;
        registrationForSave = saveButton
                .addClickListener(e -> saveClicked());


        item.getPaths().stream()
                .map(r -> new ClosableButton(r, r))
                .peek(t -> formLayout.add(t));

        item.getPaths().forEach(m -> {
            ClosableButton btn = new ClosableButton(m, m);
            add(btn);
        });


        item.getMethods().forEach(m -> {
            ClosableButton btn = new ClosableButton(m.name(), m.name());
            add(btn);
        });


        binder.readBean(currentItem);


        open();
    }

    private void createPathField(String value){
        TextField field = new TextField("Path");

    }

    private void saveClicked() {
        boolean isValid = binder.writeBeanIfValid(currentItem);

    }

    private void deleteClicked() {

    }


}
