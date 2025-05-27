package org.example;
import java.lang.Class;
import java.lang.Package;

public class FindPackages {

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
