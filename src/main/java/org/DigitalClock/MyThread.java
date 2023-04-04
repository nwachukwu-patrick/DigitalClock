package org.DigitalClock;

public class MyThread implements  Runnable{

    MyThread()
    {
        System.out.println("Hello");
    }
    @Override
    public  void  run(){
        System.out.println("world");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
