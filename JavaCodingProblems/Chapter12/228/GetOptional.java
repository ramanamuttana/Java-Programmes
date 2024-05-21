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
            Optional<String> status = ...; // this is prone to be empty

            // Avoid 
            //  if (status.isPresent()) {
            //    return status.get();
                // do something with "theBook"
            //} else {
            //   return BOOK_STATUS;
            //  }
            //preferred
           return status.orElse(BOOK_STATUS);
          // orElse is evaluted even though the value is not empty ,
            // and this should be used only when the arguementis already contrained.
        }
    }
//Output:UNKNOWN is output

