package org.parsejson;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.IOException;

public class ReadWriteJsonB {
public static void main(String[] args) throws IOException {
  Jsonb jsonb = JsonbBuilder.create();
// Read
String jsonInput = " {\"id\":0,\"firstName\":\"Robin\",\"lastName\":\"Williams\"}";
 Person rw = jsonb.fromJson(jsonInput, Person.class);
 System.out.println(rw);
 String result = jsonb.toJson(rw);
System.out.println(result);
}
}
