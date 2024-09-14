package org.example;


class Machinedemo{
    void on (){
        System.out.println(" Machine is on ");
    }
}

class TractorVehicle extends Machinedemo{
    @Override
    void on (){
        System.out.println(" Tractor is on ");
    }
}
public class Lowerclassup {

    public static void main(String[] args) {


        doAction(new Machinedemo());
        doAction(new TractorVehicle());

    }

    public static void doAction(Machinedemo maa){
        if(maa instanceof  TractorVehicle t){
            t.on();
        }


    }
}
