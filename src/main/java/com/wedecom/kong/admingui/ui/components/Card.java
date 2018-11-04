package com.wedecom.kong.admingui.ui.components;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Paragraph;
import lombok.Getter;

@Getter
public class Card extends Div {

    private Div cardTitle = new Div();
    private H6 subTitle = new H6();
    private Paragraph content = new Paragraph();
    private Button editBtn = new Button();
    private Button saveBtn = new Button();


    public Card() {
        addClassNames("card", "shadow" , "p-3", "mb-5", "w-75");

        cardTitle.addClassNames("card-header", "bg-dark", "text-white");

        Div body = new Div();
        body.setClassName("card-body");


        subTitle.addClassNames("card-subtitle", "mb-2", "text-muted");
        content.addClassName("card-text");

        editBtn.setText("Edit");
        editBtn.addClassNames("btn","btn-primary", "mr-1");

        saveBtn.setText("Save");
        saveBtn.addClassNames("btn","btn-secondary");

        Div btnToolbar = new Div();
        btnToolbar.setClassName("btn-toolbar");
        btnToolbar.add(editBtn);
        btnToolbar.add(saveBtn);

        body.add(subTitle, content, btnToolbar);

        add(cardTitle, body);
    }

    public void setCardTitle(String text) {
        cardTitle.setText(text);
    }

    public void setSubTitle(String text){
        subTitle.setText(text);
    }

    public void setContent(String text){
        content.setText(text);
    }

    public void setButton(){

    }


}

