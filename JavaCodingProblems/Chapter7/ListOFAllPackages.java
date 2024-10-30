package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfAllPackages {
    public static  void main(String[]  args ){
        List<String> packagesSamePrefix
                = getPackagesList("java.util" );
        packagesSamePrefix.forEach(packagesNames->System.out.println(packagesNames));
    }

    public static List<String> getPackagesList(String prefix ){
       // Package[] packageList= Package.getPackages();
        return Arrays.stream(Package.getPackages())
                .map(Package::getName)
                .filter(n->n.startsWith(prefix))
                .collect(Collectors.toList());

    }
  // output 
  /**
  *java.util.concurrent
  *java.util.concurrent.atomic
  *java.util.jar
  *java.util.stream
  *java.util.concurrent.locks
  *java.util.function
  *java.util.zip
  *java.util
  **/

}
