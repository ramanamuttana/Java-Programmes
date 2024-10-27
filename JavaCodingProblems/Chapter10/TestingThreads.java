package org.example;

public class TestingThreads {

    // NEW state 
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TestingThreads tthreads =new TestingThreads();
        tthreads.runnableThreads();
    }

    public void runnableThreads(){
        Thread t1=new Thread(()->{});
        System.out.println(t1.getState()+"  Thread State ");
    }
}
