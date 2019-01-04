package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class SampleController {
    public Label helloWorld;
    int numClick=0;
    public void sayHelloWorld(ActionEvent actionEvent) {
        numClick++;
        helloWorld.setText("You clicked "+numClick+" times.");
    }
}
