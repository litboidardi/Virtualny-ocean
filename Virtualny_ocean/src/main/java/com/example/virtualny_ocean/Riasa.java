package com.example.virtualny_ocean;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Riasa extends Rastlina {

    public Riasa(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
        super(w, h, x, y, root, scene, farba);
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
            switch (rast) {
                case 0, 18 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 99, 5, 60);
                }
                case 1, 17 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 97, 5, 60);
                }
                case 2, 16 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 95, 5, 60);
                }
                case 3, 15 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 92, 5, 60);
                }
                case 4, 14 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 89, 5, 60);
                }
                case 5, 13 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 86, 5, 60);
                }
                case 6, 12 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 83, 5, 60);
                }
                case 7, 11 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 80, 5, 60);
                }
                case 8, 10 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 77, 5, 60);
                }
                case 9 -> {
                    gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                    gc.setFill(farba);
                    gc.fillRect(40, 73, 5, 60);
                }
            }
        }
    }
}