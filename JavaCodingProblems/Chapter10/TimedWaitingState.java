package org.example;

public class TimedWaitingState {
    public static void main(String[] args ) throws InterruptedException {

        Thread t1=new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        Thread.sleep(500);
        System.out.println("TimedWaitingThread t: "
                + t1.getState()); // TIMED_WAITING


    }
    }
