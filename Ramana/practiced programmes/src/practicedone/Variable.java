package practicedone;

public class Variable {
	static int var;
	public static void main(String[]args){
		String str = "1 2 3 10 11";
	   String  sum =null;
        String[] temp;
		String delimiter = " ";

		temp = str.split(delimiter);   
		String value1 = temp[0];   
		String value2 = temp[1];
		String value3 = temp[2];
		String value4 = temp[3];
		String value5 = temp[4];
		System.out.println(value1+" "+value2+" "+value3+" "+value4+" "+value5);
		 int d=Integer.parseInt(value1);
		 int e=Integer.parseInt(value2);
		 int f=Integer.parseInt(value3);
		 int g=Integer.parseInt(value4);
		 int h=Integer.parseInt(value5);
		 int i=d+e;
		System.out.println(i);
		
	}
	

}
