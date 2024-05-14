package org.example;

import java.util.Optional;

public class GetOptional {

    public static void main(String[] args) {
        // Example 227
        // if we have decided to call Optional.get() to fetch the value wrapper
        Optional<Book> book = ...; // this is prone to be empty
        // Optional<Book> book =Optional.empty(); This always return if(book.ispresent())-->false
        // Optional<Book> book =null; // we get Null pointer exception
        /* Avoid
        // if "book" is empty then the following code will
        // throw a java.util.NoSuchElementException
        
        // Book theBook = book.get(); // code 
        
        // In other words, before fetching the value via Optional.get(), we need to prove that
        // the value is present. A solution consists of calling isPresent() before calling get().
        // This way, we add a check that allows us to handle the missing value case:
        // Prefer */
        if (book.isPresent()) {
            Book theBook = book.get();
            // do something with "theBook"
        } else {
            System.out.println("Book is not Present");
        }
    }
}
//Output:Book is not Present
