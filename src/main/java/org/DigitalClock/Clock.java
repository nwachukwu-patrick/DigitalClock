package org.DigitalClock;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicReference;

public class Clock {
    Thread thread = null;
    Runnable run = null;
    String time= null;

    public Clock() {
    }
        public  String getCurrentTime(){
        CurrentDateTime dateTime = ()->{
            LocalDateTime time = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            this.time = formatter.format(time);

        };

        run = ()-> dateTime.get();

        Thread t = new Thread(run);
        t.start();

            while(true) {
                try {
                    run.run();
                    t.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return this.time;
            }


    }
    public String getCurrentDate(){
        String currentTime = null;
        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        currentTime = ""+formatter.format(time);

        return currentTime;
    }

    public static void main(String[] args) {

        Clock clock = new Clock();
        clock.getCurrentDate();
        System.out.println( clock.getCurrentTime());

    }

}
