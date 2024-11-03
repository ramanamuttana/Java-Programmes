package org.example;

public class SeparateDeclarartionandInitialization {

    public static void main(String[] args){

        int[] array9;                        // Array declaration - uninitialized
        array9 = new int[3];                 // Initialize array - { 0, 0, 0 }
        array9[0]=2;                         // Set index 0 value - { 2, 0, 0 }
        array9[1]=5;                         // Set index 1 value - { 2, 5, 0 }
        array9[2]=7;                         // Set index 2 value - { 2, 5, 7 }
        System.out.println(array9[2]+" Array9,2 nd index ");
    }
}
