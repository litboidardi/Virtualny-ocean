package com.example.virtualny_ocean;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Zralok extends Zivocich {
    int hranica = 50;
    int smer = 1;
    double start_x;


    public Zralok(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
        super(w, h, x, y, root, scene,farba);
        start_x = getLayoutX();
    }

    public void pohyb() {
        if (getLayoutX() > start_x + hranica) smer *= -1;
        if (getLayoutX() < start_x - hranica) smer *= -1;
        setLayoutX(getLayoutX() + smer * 10);
    }

    public void vykresli() {
        if (isFocused()) {
            gc.setStroke(Color.RED);
            gc.strokeLine((getWidth()+1)-getWidth(),getHeight()-getHeight(), (getWidth()+1)-getWidth(), getHeight());
            gc.setStroke(Color.RED);
            gc.strokeLine(getWidth()-1,getHeight()-getHeight(), getWidth()-1, getHeight());
            gc.setStroke(Color.RED);
            gc.strokeLine((getWidth()+1)-getWidth(),getHeight()-1, getWidth()-1, getHeight()-1);
            gc.setStroke(Color.RED);
            gc.strokeLine((getWidth()-10)-getWidth(),getHeight()-getHeight(), getWidth(), (getHeight()+1)-getHeight());
        } else {
            gc.clearRect(0, 0, getWidth(), getHeight());
            gc.setFill(farba);
            gc.fillOval(0, 9, 55, 29);
            gc.setFill(farba);
            gc.fillOval(16, 0, 14, 25);

        }

    }


}

