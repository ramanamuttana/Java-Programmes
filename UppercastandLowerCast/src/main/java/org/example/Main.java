package org.example;
class Machine {
    void on (){
        System.out.println(" machine is on ");
    }
}

class Tractor extends Machine {
    @Override
    void on (){
        System.out.println("Tractor is on ");
    }
}
public class Main {
    public static void main(String[] args) {
        Machine ma=new Tractor();
        doAction(ma);
        doAction(new Tractor());

    }

    public static void doAction(Machine maa){
        maa.on();

    }
}