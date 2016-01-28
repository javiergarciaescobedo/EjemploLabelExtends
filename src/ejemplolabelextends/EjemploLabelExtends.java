/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolabelextends;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Javier
 */
public class EjemploLabelExtends extends Application {
    
    Label localLabel = new Label("Label local");
    LabelContenida labelContenida = new LabelContenida();
    LabelExtendida labelExtendida = new LabelExtendida();
    
    @Override
    public void start(Stage primaryStage) {
        
        labelExtendida.setRandomText(10);
        
        Button btn = new Button();
        btn.setText("Cambiar label");
        btn.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent event) {
                localLabel.setText("Label local cambiado");
                labelContenida.setLabelText("Label contenido cambiado");
                labelExtendida.setText("Label extendida cambiado");
            }
        });
        
        VBox root = new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(localLabel);        
        root.getChildren().add(labelContenida.getLabelContenido());
        root.getChildren().add(labelExtendida);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
