package com.example.virtualny_ocean;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.AQUAMARINE);
        VBox hbo = new VBox(2);

        //tlačítka na vytváranie objektov
        Button stromcek = new Button("LEKNO");
        stromcek.setOnAction(actionEvent -> {
            double x = (Math.random()*scene.getWidth())+60;
            double y = Math.random()*(scene.getHeight());
            Lekno strom = new Lekno(100,110,x,y,root,scene, Color.LIGHTBLUE);
            root.getChildren().add(strom);
        });
        Button kvetinka = new Button("RIASA");
        kvetinka.setOnAction(actionEvent -> {
            double x = 60+(Math.random()*scene.getWidth());
            double y = Math.random()*(scene.getHeight());
            Riasa kvet = new Riasa(100,100,x,y,root,scene, Color.GREEN);
            kvet.getTransforms().add(new Rotate(45,0,0)); //
            root.getChildren().add(kvet);
        });
        Button kapor = new Button("KAPOR");
        kapor.setOnAction(actionEvent -> {
            double x = (Math.random()*scene.getWidth())+60;
            double y = Math.random()*(scene.getHeight());
            BubliKapor kaporko = new BubliKapor(18,40,x,y,root, scene,Color.DARKGRAY);
            root.getChildren().add(kaporko);
        });
       Button zralok = new Button("ŽRALOK");
        zralok.setOnAction(actionEvent -> {
            double x = (Math.random()*scene.getWidth())+60;
            double y = Math.random()*(scene.getHeight());
            Zralok zralocik = new Zralok(60,50,x,y,root, scene, Color.DARKBLUE);
            root.getChildren().add(zralocik);
        });
        Button nemo = new Button("NEMO");
        nemo.setOnAction(actionEvent -> {
            double x = (Math.random()*scene.getWidth())+60;
            double y = Math.random()*(scene.getHeight());
            Nemo neminko = new Nemo(36,15,x,y,root, scene, Color.ORANGE);
            root.getChildren().add(neminko);
        });
        Button krab = new Button("KRAB");
        krab.setOnAction(actionEvent -> {
            double x = (Math.random()*scene.getWidth())+60;
            double y = Math.random()*(scene.getHeight());
            Krab evzen = new Krab(20,20,x,y,root, scene,Color.DARKRED);
            root.getChildren().add(evzen);
        });

        Button btn1 = new Button("farba");
        btn1.setOnAction(e-> {
            for (int i = 0; i < root.getChildren().size(); i++) {
                Node moj = root.getChildren().get(i);
                if (moj instanceof Zralok) ((Zralok) moj).zmenFarbu(Color.BLUE);
            }
        });
        Button btn2 = new Button("farba skupiny");
        btn2.setOnAction(e-> {
                for (int i = 0; i < root.getChildren().size(); i++) {
                    Node tvoj = root.getChildren().get(i);
                    if (tvoj instanceof Rastlina) ((Rastlina) tvoj).zmenFarbu(Color.RED);
                }
        });
        Button btn3 = new Button("posuň");
        btn3.setOnAction(e-> {
                    for (int i = 0; i < root.getChildren().size(); i++) {
                        Node moj = root.getChildren().get(i);
                        if (moj instanceof Zivocich) ((Zivocich) moj).posun();
                    }
                });

        hbo.getChildren().addAll(stromcek, kvetinka, kapor,zralok,nemo, krab,btn1,btn2,btn3);
        root.getChildren().add(hbo);

        stage.setTitle("Virtuálny oceán");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}