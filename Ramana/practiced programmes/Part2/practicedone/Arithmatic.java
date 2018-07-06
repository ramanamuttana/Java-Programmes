package practicedone;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmatic {
    
     

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        Arithmatic ar=new Arithmatic ();
        tipPercent=(int)Math.round(ar.getvalues(mealCost));
        System.out.println("The total tipPercent is "+tipPercent+" "+"dollars.");
        double d=(int)Math.round(mealCost);
        System.out.println("The total mealCost is "+d+" "+"dollars.");
        taxPercent=(int)Math.round(ar.getvaluess(mealCost));
        System.out.println("The total taxPercent is "+taxPercent+" "+"dollars.");
        double value=tipPercent+taxPercent+(int)Math.round(d);
        System.out.println("The total totalcost is "+value+" "+"dollars.");
        int totalCost = (int) Math.round(value);
        System.out.println("The total meal cost is "+totalCost+" "+"dollars.");
    }
    
         public static double getvalues(double mealCost)
        {
            double  tipPercent=mealCost*20/100;
           return tipPercent;
        }
         public static double getvaluess(double mealCost)
         {
           double taxPercent=mealCost*8/100;
           return taxPercent;
         }
        
        // cast the result of the rounding operation to an int and save it as totalCost 
     
      
        // Print your result
        //System.out.println("The total meal cost is "+totalCost+"dollars.");
    }