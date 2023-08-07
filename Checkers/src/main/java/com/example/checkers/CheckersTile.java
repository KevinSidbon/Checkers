package com.example.checkers;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CheckersTile {
    // Variable to store the tile ID
    private int id;

    // Variable to store the piece on the tile
    private String piece;

    // Variable to store the color of the tile
    private String color;

    CheckersTile(){

    }

    // Method to get the piece on the tile
    public String getPiece() {
        return piece;
    }

    // Method to set the piece on the tile
    public void setPiece(String piece) {
        this.piece = piece;
    }

    // Method to get the tile ID
    public int getId() {
        return id;
    }

    // Method to set the tile ID
    public void setId(int id) {
        this.id = id;
    }

    // Method to get the color of the tile
    public String getColor() {
        return color;
    }

    // Method to set the color of the tile
    public void setColor(String color) {
        // Only allow the color to be set to "white" or "black"
        if (color == "white" || color == "black") {
            this.color = color;
        }
    }

    // Method to draw the tile
    public void draw(GraphicsContext gc, int x, int y, int width, int height) {
        // Set the fill color based on the piece on the tile
        if (piece == "player1") {
            gc.setFill(Color.BLACK);
        } else if (piece == "player2") {
            gc.setFill(Color.WHITE);
        } else {
            // Set the fill color based on the tile color
            if (color == "white") {
                gc.setFill(Color.WHITE);
            } else if (color == "black") {
                gc.setFill(Color.BLACK);
            }
        }

        // Draw a rectangle to represent the tile
        gc.fillRect(x, y, width, height);
    }
}
