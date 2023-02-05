/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package exercise11photonrosacayjillian;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jillian
 */
public class Exercise11photonrosacayjillian extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        primaryStage.setTitle("Ph24 Rosacay Exercise 11");
        
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        
        ImageView sampleImage = new ImageView();
        Image img = new Image(Exercise11photonrosacayjillian.class.getResourceAsStream("/math.png"));
        sampleImage.setImage(img);
        root.getChildren().add(sampleImage);
        
        Text name = new Text("Subject: " + math.getName() + "\nUnits: " + math.getUnits() + "\nGrade: " + math.getGrade());
        root.getChildren().add(name);
        
        Button button = new Button("Next");
        root.getChildren().add(button);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
