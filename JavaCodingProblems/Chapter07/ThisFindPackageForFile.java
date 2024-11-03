package org.example;

import java.io.File;

public class ThisFindPackageForFile {

    public static void main(String[] args ) throws ClassNotFoundException {

        ThisFindPackageForFile findPackageForFile=new ThisFindPackageForFile();
        // this class Package name
        String thisPackagename=findPackageForFile.getPackage();
        System.out.println(" This class package name "+thisPackagename);

        File file=new File(".");
        Package packageOfFile = file.getClass().getPackage();
        // Retrieve the package name
        String packageNameOfClazz = packageOfFile.getName();
        System.out.println("Package name of Integer class: " + packageNameOfClazz);
    }

    public String getPackage(){
        return this.getClass().getPackage().getName();
    }

}
