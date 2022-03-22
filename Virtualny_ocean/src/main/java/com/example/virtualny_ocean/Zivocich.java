package com.example.virtualny_ocean;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public abstract class Zivocich extends Canvas {
    Timeline t;
    GraphicsContext gc;
    Scene scene;
    Group root;
    Color farba;

    public Zivocich(int w, int h, double x, double y, Group root, Scene scene,Color farba){
        super(w,h);
        this.farba = farba;
        setLayoutX(x);
        setLayoutY(y);
        this.scene=scene; this.root=root;
        gc = this.getGraphicsContext2D();

        setFocusTraversable(true);
        setOnKeyPressed(this::spracujKB);
        setOnMouseClicked(evt-> { requestFocus(); vykresli(); });

        t = new Timeline(new KeyFrame(Duration.seconds(1), e -> pohyb()));
        t.setCycleCount(Animation.INDEFINITE);
        t.play();
        vykresli();
    }
    protected void vykresli() {
        gc.clearRect(0,0,getWidth(),getHeight());
        if (isFocused()) {
            gc.setFill(Color.RED);
            gc.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    public void spracujKB(KeyEvent evt){
        KeyCode k = evt.getCode();
        if (k == KeyCode.DELETE) {
            Zmaz();
        }
    }
    public void zmenFarbu(Color nova) {
        farba = nova; vykresli();
    }
    public void pohyb() {}

    public void posun() {
        setLayoutY(getLayoutY()+5);
    }
    private void Zmaz() {
        ((Group)getParent()).getChildren().remove(this);
    }
}
