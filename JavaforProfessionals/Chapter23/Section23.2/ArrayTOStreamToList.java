package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayTOStreamToList {


    public static void main(String[] args){
        // initialization and declarartion
        int[] initialValues=new int[]{1,2,3,4};

        Stream<Integer> streamValues= Arrays.stream(initialValues).boxed();

        // List<Integer> tolistValues=Arrays.stream(initialValues).boxed().collect(Collectors.toList());
        List<Integer> tolistValues=streamValues.toList();

    }

}
