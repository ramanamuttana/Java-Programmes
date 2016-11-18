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

}
