package org.example;

// 99 question

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args){
        int[] integers = new int[]{2, 4, 3, 7, 5};
        Arrays.sort(integers); // This sorts the array in-place

        // Now you can print or use the sorted array
        System.out.println(Arrays.toString(integers));
    }
}

