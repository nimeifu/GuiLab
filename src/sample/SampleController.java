package sample;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class SampleController {
    @FXML
    private Label score;
    @FXML
    private Label timer;
    int numClick=0;
    long timeStep;

    public void sayHelloWorld(ActionEvent actionEvent) {
        numClick++;
        score.setText("You clicked "+numClick+" times.");
    }


    public void initialize(){
        startTimer();
    }


    public void startTimer()
    {
        timeStep=System.nanoTime()+10000000000L;
        new AnimationTimer()
        {
            public void handle (long now)
            {
                timer.setText("Timer: " + (int)((timeStep-now)/1000000000));
                if(now>timeStep)
                {
                    timeStep=now+10000000000L;

                }
            }
        }.start();
    }


}
