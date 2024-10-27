package org.example;

public class TerminatedState {

    public static void main(String[] args) throws InterruptedException {
        terminatedSatet();
    }

    public static void terminatedSatet() throws InterruptedException {

        Thread t = new Thread(() -> {});
        t.start();
        Thread.sleep(1000);
        System.out.println("TerminatedThread t: "
                + t.getState()); // TERMINATED

    }
}
