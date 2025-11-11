package org.example.tuple;

import java.util.Comparator;
import java.util.Map;

import static java.util.Map.entry;

public class Bounds {

    public static <T> Map.Entry<T, T> array(T[] arr, Comparator<? super T> c) {
        T min = arr[0];
        T max = arr[0];
        for (T elem: arr) {
            if (c.compare(min, elem) > 0) {
                min = elem;
            } else if (c.compare(max, elem)<0) {
                max = elem;
            }
        }  return entry(min, max);
}
}
