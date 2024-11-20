package org.example;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import java.util.Map;

public class MultipleretunrTypes {
    public static void main(String[] args) {

        doMapOf();
        doPair();
        doTriple();
        System.out.println("Hello world!");
    }

    public static Map<Integer, String> doMapOf(){
        return Map.of(10, "Ten");
    }

    public static Triple<Integer, String, Integer> doTriple(){
        return Triple.of(10, "Ten",13);
    }

    public static Pair<Integer, String> doPair(){
        return Pair.of(10, "Ten");
    }
}