package org.example;

public class LockingAtObjectLevel {
    public static void main(String[] args) {

        LockingAtObjectLevel  testingThreads= new LockingAtObjectLevel ();
        TestingAboveClass testingAboveClass=new TestingAboveClass( testingThreads);
        TestingAboveClass2 testingAboveClass2=new TestingAboveClass2( testingThreads);
        testingAboveClass.start();
        testingAboveClass2.start();

    }
    public synchronized void m1(){
        System.out.println("in Method m1 the thread name is :"+Thread.currentThread().getName());
    }

    public synchronized void m2(){
        System.out.println("in Method m2 the thread name is :"+Thread.currentThread().getName());
    }
}

class TestingAboveClass extends Thread{
   LockingAtObjectLevel  testingThreads=null;
    TestingAboveClass(LockingAtObjectLevel  testingThreads){
        this.testingThreads=testingThreads;
    }

    @Override
    public void run(){
        testingThreads.m1();
        testingThreads.m2();
    }

}

class TestingAboveClass2 extends Thread{

   LockingAtObjectLevel  testingThreads=null;
    TestingAboveClass2(LockingAtObjectLevel  testingThreads){
        this.testingThreads=testingThreads;
    }

    @Override
    public void run(){
        testingThreads.m1();
        testingThreads.m2();
    }

}
