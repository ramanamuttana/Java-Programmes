package org.example;

import java.io.File;

public class FindPackageForFile {

    public static void main(String[] args ) throws ClassNotFoundException {

        File file=new File(".");
        //  file.getClass().getPackage().getName();
        Package packageOfFile = file.getClass().getPackage();

        // Retrieve the package name
        String packageNameOfClazz = packageOfFile.getName();

        System.out.println("Package name of Integer class: " + packageNameOfClazz);
    }
}
// output:Package name of File class: java.io

