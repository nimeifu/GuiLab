package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.awt.event.MouseEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Label label=new Label("");
        Button button=new Button("click me!");
        button.setStyle("-fx-text-fill: #0000ff");


        int test = 0;
        HBox hbox=new HBox(button,label);
        button.setOnAction(event ->
        {
            label.setText("You clicked " + button.getClickCount() + " times");
        });
        Scene scene=new Scene(hbox,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }




}
