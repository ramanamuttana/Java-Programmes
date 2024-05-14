package org.example;

import java.util.Optional;

public class Initializeoptional {
    public static void main(String[] args) {
        // Example 226
        // Avoid , not the right way to initialize
        Optional<Book> bookAvoid=null;

        // the correct way to initialize is
        Optional<Book> bookPrefered = Optional.empty();

        System.out.println("Hello world!");

    }
}
