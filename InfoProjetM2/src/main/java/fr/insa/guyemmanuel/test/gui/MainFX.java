/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.guyemmanuel.test.gui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author IEUser
 */
public class MainFX extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b= new Button ("yooo!!");
        Scene s= new Scene (b);
        primaryStage.setScene(s);
        primaryStage.show();
        
    }
    
    public static void main(String[] args){
        launch(args);
    } 
}
