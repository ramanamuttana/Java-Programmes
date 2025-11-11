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

    public static class FindPackages {

        //  get the name of the package

        public static void main(String[] args ) throws ClassNotFoundException {
            // Load the class for Integer
            Class<?> clazz = Class.forName("java.lang.Integer");

            // Get the package of the class
            Package packageOfClazz = clazz.getPackage();

            // Retrieve the package name
            String packageNameOfClazz = packageOfClazz.getName();

            System.out.println("Package name of Integer class: " + packageNameOfClazz);
        }
    }
}

