package org.DigitalClock;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Frame extends JFrame {
    JPanel panel;
    JLabel timeLabel;
    Clock clock;
    Runnable run = null;
    Frame(){
        clock = new Clock();
        setPanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setSize(new Dimension(400,400));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.CYAN);
        this.setVisible(true);
    }
    void setPanel(){
       setTimeLabel();
       panel = new JPanel();
       panel.setBackground(Color.CYAN);
       panel.add(timeLabel);

    }
    void setTimeLabel(){
            timeLabel = new JLabel(clock.getCurrentTime());
//            timeLabel.setText(formatter.format(time));
            timeLabel.setFont(new Font("Algerian", Font.BOLD, 30));



    }

    public  void getCurrentTime(){

    }

}
