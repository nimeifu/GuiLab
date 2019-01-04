package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class SampleController {
    public Label score;
    int numClick=0;
    public void sayHelloWorld(ActionEvent actionEvent) {
        numClick++;
        score.setText("You clicked "+numClick+" times.");
    }
}
