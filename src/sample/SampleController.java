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
    @FXML
    private Label start;
    int numClick=0;
    long timeStep;



    public void initialize() {
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

                    stop();
                    timeStep=0;


            }

            }
        }.start();
    }
    public void ClickEvent(ActionEvent actionEvent) {

        if(timeStep==0)
        {
            score.setText("Time is up! "+"You score is "+numClick);
        }

        else {
            numClick++;
            score.setText("You clicked " + numClick + " times.");
        }
        }



}





