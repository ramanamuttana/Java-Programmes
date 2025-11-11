package org.example.tuple;

import java.util.Comparator;
import java.util.Map;

public class Tuple{


    public static  void main(String[] args){

        getLemonWithHighestWeight();
    }

    public static void getLemonWithHighestWeight(){
        Melon[] melons={
                new Melon("lemon",234),
                new Melon("greenlemon",334),
                new Melon("yellowlemon",134),
                new Melon("icelandlemon",634),
                new Melon("hybridlemon",534),
                new Melon("biolemon",734)
        };
        Comparator<Melon> melonComparator=Comparator.comparing(Melon::getWeight);
        Map.Entry<Melon, Melon> minmax1 = Bounds.array(melons,melonComparator);
        System.out.println("Min: " + minmax1.getKey());   // Hami(800g)
        System.out.println("Max: " + minmax1.getValue());

    }
}
