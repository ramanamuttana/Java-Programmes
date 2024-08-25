package org.example.returningaconstructedvalue;

import org.example.getvalue.Book;
import java.util.Optional;
public class GetOptional {

    private static final String BOOK_STATUS="UNKNOWN";
    public static void main(String[] args) {
        GetOptional getOptional=new GetOptional();
        getOptional.findStatus();
    }
    public String findStatus(){
            // Example 228
            // 1. Optional<String> status = ...; // this is prone to be empty // avoid 1. ...BOOK_STATUS will execute 

           Optional<String> status =Optional.empty(); // 2 status.get () will execute


            /* Avoid 
            *  if (status.isPresent()) {
            *    return status.get();
            *  // do something with "theBook"
            *} else {
            *   return BOOK_STATUS;
            *  }
            *///preferred
           return status.orElse(BOOK_STATUS);
            // orElse is evaluted even though the value is not empty ,
            // and this should be used only when the arguementus are already contained.
        }
    }
//Output:UNKNOWN is output

