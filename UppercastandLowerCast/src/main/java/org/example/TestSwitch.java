package org.example;


interface Vehicle{

}
class Car implements Vehicle{
    void on (){
        System.out.println(" Machine is on ");
    }
}

class Toyata extends Car{
    @Override
    void on (){
        System.out.println(" Toyata  is on ");
    }
}

class Mercedes extends Car{
    @Override
    void on (){
        System.out.println(" Mercedes is on ");
    }
}

public class TestSwitch {
    public static void main(String[] args) {


        doAction(new Toyata());
        doAction(new Mercedes());
        doAction(null);

    }

    public static void doAction(Vehicle  maa){
       switch(maa){
           case Toyata t -> t.on();
           case Mercedes m-> m.on();
           case null, default -> {
               System.out.println(" it is empty");
           }
       }

    }

}

