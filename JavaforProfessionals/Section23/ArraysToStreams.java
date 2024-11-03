package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysToStreams {

    public static void main(String[] args ){

        // convert an array to List
        Integer[] integerValues= {23,Integer.valueOf(45)};

        List<Integer> values=Arrays.asList(integerValues);

        // convert List values into array of integers
        Integer[]  listToArray=values.toArray(new Integer[values.size()]);

        // with streams

        Stream<Integer> streamValues=Arrays.stream(integerValues);
        Integer[]  toArrayValuesFromStream=streamValues.toArray(Integer[]::new);

    }
}
