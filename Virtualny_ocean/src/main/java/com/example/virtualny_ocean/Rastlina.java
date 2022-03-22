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

    public abstract class Rastlina extends Canvas {
        GraphicsContext gc;
        Timeline t;
        Group root;
        Scene scene;
        Color farba;
        int rast=-1;

        public Rastlina(int w, int h, double x, double y, Group root, Scene scene, Color farba) {
            super(w,h);
            setLayoutX(x);
            setLayoutY(y);
            this.scene=scene; this.root=root; this.farba=farba;
            gc = this.getGraphicsContext2D();

            setFocusTraversable(true);
            setOnKeyPressed(this::spracujKB);
            setOnMouseClicked(evt-> { requestFocus(); vykresli(); });
            //timer, pre rýchlosť rastu
            t = new Timeline(new KeyFrame(Duration.seconds(0.5), event -> {
                vyrast();
                vykresli();
            }));
            t.setCycleCount(Animation.INDEFINITE);
            t.play();
        }
        //metóda, vďaka ktorej objekt dokáže meniť svoju veľkosť
        public void vyrast() {
            rast++;
            if(rast>19) rast=0;
        }
        protected void vykresli() {
            gc.clearRect(0,0,getWidth(),getHeight());
            if (isFocused()) {
                gc.setFill(Color.RED);
                gc.fillRect(0,0, getWidth(), getHeight());
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
        //metóda vykreslujúca objekty, ich tvary a farby sú presne určené v daných podtriedach (Strom, Kvet a Krik)

        private void Zmaz() {
            ((Group)getParent()).getChildren().remove(this);
        }

    }