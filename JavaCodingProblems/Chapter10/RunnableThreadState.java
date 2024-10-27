package org.example;

public class RunnableThreadState {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        RunnableThreadState tthreads =new RunnableThreadState();
        tthreads.runnableThreads();
    }

    public void runnableThreads(){
        Thread t1=new Thread(()->{});
        t1.start();
        System.out.println(t1.getState()+"  Thread State ");
    }
}
