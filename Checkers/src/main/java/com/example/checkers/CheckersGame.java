package com.example.checkers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckersGame extends Application {
    // Create a CheckersTile object
    CheckersTile tile = new CheckersTile();

    // Set the tile ID and piece
    tile.setId(1);
    tile.setPiece("player1");
    tile.setColor("white");

    @Override
    public void start(Stage stage) {
        // Create a Canvas object
        Canvas canvas = new Canvas(500, 500);

        // Get the GraphicsContext from the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Use the draw() method of the CheckersTile object to draw the tile
        tile.draw(gc);

        // Add the Canvas to the Scene
        Scene scene = new Scene(canvas);

        // Set the title of the Stage
        stage.setTitle("Checkers Game");

        // Add the Scene to the Stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}