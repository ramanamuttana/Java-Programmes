package org.example;

public class ClassLevelLocking {

    public static void main(String[] args) {

        TestingAbove1 testingAboveClass=new TestingAbove1( );
        TestingAbove2 testingAboveClass2=new TestingAbove2( );
        testingAboveClass.start();
        testingAboveClass2.start();
    }
    public static synchronized void m1(){
        System.out.println("in Method m1 the thread name is :"+Thread.currentThread().getName());
    }

    public static synchronized void m2(){
        System.out.println("in Method m2 the thread name is :"+Thread.currentThread().getName());
    }
}

class TestingAbove1 extends Thread{


    @Override
    public void run(){
        ClassLevelLocking.m1();
        ClassLevelLocking.m2();
    }
}

class TestingAbove2 extends Thread{

    @Override
    public void run(){
        ClassLevelLocking.m1();
        ClassLevelLocking.m2();
    }

}
