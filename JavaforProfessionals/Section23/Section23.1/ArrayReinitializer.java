package org.example;

public class ArrayReinitializer {

    public static void main(String[] args){
        int[] array=new int[]{1,2,3};

        for(int i:array){
            System.out.println(i+" after 1 st initialization");
        }

        array=new int[]{4,5,6};
        for(int i:array){
            System.out.println(i+" after 2 nd  initialization");
        }

       // array={2,3,4};//Compile-time error! Can't re-initialize an array via shortcut
                      // syntax with array initializer.
    }
}
