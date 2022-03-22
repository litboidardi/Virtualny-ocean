package com.example.virtualny_ocean;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class BubliKapor extends Zivocich{

    public BubliKapor(int w, int h, double x, double y, Group root, Scene scene,Color farba) {
        super(w, h, x, y, root, scene,farba);
    }

    public void pohyb() {
    setLayoutY(getLayoutY()-10);
    if(getLayoutY()==-20){
        root.getChildren().remove(this);
        gc.clearRect(0,0,getWidth(),getHeight());
    }
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
            gc.fillOval(0, 0, 14, 35);

        }
    }

}
