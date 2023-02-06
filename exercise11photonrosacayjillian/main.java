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
public class main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        Subject displayedSubject = math;
        
        primaryStage.setTitle("Ph24 Rosacay Exercise 11");
        
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        
        ImageView sampleImage = new ImageView();
        Image img = new Image(main.class.getResourceAsStream(displayedSubject.getImgFileName()));
        sampleImage.setImage(img);
        root.getChildren().add(sampleImage);
        
        Text text = new Text("Subject: " + displayedSubject.getName() + "\nUnits: " + displayedSubject.getUnits() + "\nGrade: " + displayedSubject.getGrade());
        root.getChildren().add(text);
        
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
