package practicedone;
import java.util.Date;
import java.text.*;

public class Datetime {

public static void main(String[] args) {
         Date date=new Date();
          System.out.println(date.toString());
           int c=date.getMonth();
            c+=1;
           System.out.println(+c);
           SimpleDateFormat form= new SimpleDateFormat("E dd/mm/yyyy HH-mm-ss");
            System.out.println(form.format(date));
}
  // sample output
  //Default date: Sun Nov 17 14:30:15 CET 2024
//Current month (1-based): 11
//Formatted date: Sun 17/11/2024 14-30-15

}
