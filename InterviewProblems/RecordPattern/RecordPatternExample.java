package org.records;

//record Name(String fName,String lName,int age){};

public class RecordPatternExample {

    public static  void main(String[] args){

         Name name=new Name("Williams","shake",23);
         personDetails( name);
    }

    public static void personDetails(Name name) {
        if (name instanceof Name(String fName, String lName, int age)) {
            System.out.println("printing the values, the firstname as : "+fName+" the lastname as :"+lName+"age of the person :"+age);

        }
    }
}
