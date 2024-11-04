package org.example;

import java.util.Optional;

public class Non_Existence_DefaultValues {

    public static void main(String[] args){
        Non_Existence_DefaultValues non_Existence_DefaultValues=new Non_Existence_DefaultValues();
        Book defaultBook=non_Existence_DefaultValues.nonExistenceDefaultValues();
        System.out.println(defaultBook.getName()+" Default book incase any book is missing ");
    }

    public Book nonExistenceDefaultValues(){
        Optional<Book> book= Optional.empty();

        return book.orElseGet(this::computeDefault);
    }

    // adding default book inspite of empty
    public Book computeDefault(){
        System.out.println("Default value");
        Book bs=new Book();
        bs.setName("Java");
        return bs;
    }
}

