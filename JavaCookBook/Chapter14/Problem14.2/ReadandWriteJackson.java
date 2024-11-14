import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadandWriteJackson {

    //ref:Java cook book 14 th chapter

   public static void main(String[] args) throws JsonProcessingException {

       // read values from json and assign to Person Object
       ObjectMapper objectMapper=new ObjectMapper();

       String jsonInput = "{\"id\":0,\"firstName\":\"Robin\",\"lastName\":\"Wilson\"}";

       Person p=objectMapper.readValue(jsonInput,Person.class);

       System.out.println("Read and parsed Person from JSON: " + p);
   }
}
