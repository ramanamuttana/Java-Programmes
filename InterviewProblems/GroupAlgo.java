package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.StructuredTaskScope;
import java.util.stream.Collectors;

public class GroupAlgo {

    public static void main(String[] args) {
        calculateNumberandLengthOfStrings();
    }


    public static void  calculateNumberandLengthOfStrings(){
        List<String> animlaData= Arrays.asList("Dog", "Cat",
                "Elephanant", "Zebra",
                "Parrot", "Peaccock",
                "Squiarrel","crow",
                "Monkey", "Bear",
                "Lion", "Tiger",
                "crocodile", "Camel",
                "deer", "Gorilla",
                "kingfisher");
        // filter
       Map<Integer,Long> getSortedData=animlaData.stream()
                .collect(Collectors.groupingBy(s-> s.length(),Collectors.counting()));
                        getSortedData .forEach((length,counter)->System.out.println("this is length:"+length+" Counting"+counter));
    }

}
