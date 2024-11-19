package sample;

import javafx.fxml.FXML;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


public class Controller {

    // Modellen
    Circle c;
    Rectangle r;


    @FXML
    Canvas canvas;

    @FXML
    public void handleButton(){

        draw(100,100,80,20);
    }

    // Hjælpemetode til button-kontrollens actionListener
    public void draw(int x, int y, int w, int h){

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLUEVIOLET);
        gc.fillRect(x,y,w,h);

        gc.setFill(Color.RED);
        gc.fillOval(50,50,30,30);
    }

    @FXML
    public void initialize(){
        System.out.println("initialize called");

        c= new Circle(3);

        // Opgave: Lav en tegning af et ansigt - med øjne, næse, mund (munden skal være rektangulær).
        // Koordinaterne skal helst komme fra modellen.

    }



}


