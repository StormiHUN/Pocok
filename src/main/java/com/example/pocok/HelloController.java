package com.example.pocok;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HelloController {


    public class Bober extends Label{

        int state = 0;
        ImageView kep = null;

        public Bober(){
            state = 0;
            kep = new ImageView();
            kep.setImage(new Image(getClass().getResourceAsStream("icons/pocok0.png")));
        }

        public void switchState(){
            if(state == 1) state = 0;
            else state = 1;
        }



    }

    public Pane pane;
    public Label boberCount;
    public Label boberRatio;
    public Label boberPercent;

    public void initialize(){
        for (int y = 0; y < 6; y++){
            for(int x = 0; x < 6; x++){
                Bober temp = new Bober();
                temp.setPrefHeight(128);
                temp.setPrefWidth(128);
                temp.setTranslateX(10+128*x);
                temp.setTranslateY(10+128*x);
                pane.getChildren().add(temp);
            }
        }
    }


    public void onFolytatClick() {

    }
}