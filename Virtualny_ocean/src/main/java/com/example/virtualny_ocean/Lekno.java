package com.example.virtualny_ocean;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Lekno extends Rastlina{

    public Lekno(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
        super(w, h, x, y, root, scene, farba);
    }

    public void vykresli(){
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
            case 0 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(29.5, 49.5, 31, 31);
                gc.setFill(farba);
                gc.fillOval(30, 50, 30, 30);
            }
            case 1, 17 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(27.5, 47.5, 33, 33);
                gc.setFill(farba);
                gc.fillOval(28, 48, 32, 32);
            }
            case 2, 16 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(25.5, 45.5, 36, 36);
                gc.setFill(farba);
                gc.fillOval(26, 46, 35, 35);
            }
            case 3, 15 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(23.5, 43.5, 39, 39);
                gc.setFill(farba);
                gc.fillOval(24, 44, 38, 38);
            }
            case 4, 14 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(21.5, 39.5, 41, 41);
                gc.setFill(farba);
                gc.fillOval(22, 40, 40, 40);
            }
            case 5, 13 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(19.5, 35.5, 44, 44);
                gc.setFill(farba);
                gc.fillOval(20, 36, 43, 43);
            }
            case 6, 12 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(17.5, 31.5, 47, 47);
                gc.setFill(farba);
                gc.fillOval(18, 32, 46, 46);
            }
            case 7, 11 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(15.5, 31.5, 51, 51);
                gc.setFill(farba);
                gc.fillOval(16, 32, 50, 50);
            }
            case 8, 10 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(13.5, 31.5, 54, 54);
                gc.setFill(farba);
                gc.fillOval(14, 32, 53, 53);
            }
            case 9 -> {
                gc.clearRect(0, 0, scene.getWidth(), scene.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillOval(13.5, 31.5, 56, 56);
                gc.setFill(farba);
                gc.fillOval(14, 32, 55, 55);
            }
        }
        }

    }
}
