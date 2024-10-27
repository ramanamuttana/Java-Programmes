
package org.example;

public class BlockedState {


    public static void main(String[] args) throws InterruptedException {
        BlockedState bt = new BlockedState();
        bt.blockedState();
    }

    public void blockedState() throws InterruptedException {

        Thread t1=new Thread(new SyncCode());
        Thread t2=new Thread(new SyncCode());

        t1.start();
        Thread.sleep(2000);

        t2.start();
        Thread.sleep(2000);

        System.out.println(t1.getState()+" :State "+t1.getName());
        System.out.println(t2.getState()+" :State "+t2.getName());
        System.exit(0);
    }

 class SyncCode implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName()
                + " is in run() method");
        synccode();
    }

    public static  synchronized  void synccode(){
        System.out.println("Thread " + Thread.currentThread().getName()
                + " is in run() method");
        while(true){

        }
    }
}
}
