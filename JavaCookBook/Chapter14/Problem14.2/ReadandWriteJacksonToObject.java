package org.parsejson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ReadandWriteJacksonToObject {

    //ref:Java cook book 14 th chapter

   public static void main(String[] args) throws IOException {

       // read values from json and assign to Person Object
       ObjectMapper objectMapper=new ObjectMapper();

       String jsonInput = "{\"id\":0,\"firstName\":\"Robin\",\"lastName\":\"Wilson\"}";

       Person p=objectMapper.readValue(jsonInput,Person.class);

       System.out.println("Read and parsed Person from JSON: " + p);

       /*
       * when you want to assign the data to Person Object , so that it can be transmitted over network through
       * Serialization , the receiver will get json which contains an  Object
       * IMP: now write the data to Object and write or send
       */

       Person q = new Person("Roger", "Rabbit");
       System.out.println("Person Object " + q +"  as Json ");
       objectMapper.writeValue(System.out ,q);

   }
}
