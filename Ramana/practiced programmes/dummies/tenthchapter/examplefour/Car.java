package tenthchapter.examplefour;

public class Car {
	
	public static void main(String[] args ) {
		MutableInteger holder1=new MutableInteger(14);
		MutableInteger holder2=new MutableInteger(7);
		
		System.out.println("holder1: "+holder1.value);
		System.out.println("holder2: "+holder2.value);
		
		holder1.value++;
		holder2.value++;
		MutableInteger.bigValue++;
		
		System.out.println("bigValue "+MutableInteger.bigValue);
		System.out.println("holder1: "+holder1.value);
		System.out.println("holder2: "+holder2.value);
		
		holder1.bigValue++; // not through Object Only through Classname
		System.out.println("holder1: "+holder1.bigValue);
		System.out.println("holder2: "+holder2.bigValue);
		
	}

}

class MutableInteger{
	int value;
	static int bigValue=1000000;
	public MutableInteger(int value) {
		this.value=value;
	}
}

/*
 * to access the non static variable in the static method, the variables should 
 * be a static  or it can be accessed through Object of that class , if the static
 *  variable should be accessed though outside of that class then it can be possible 
 *  though ClassName and Object but better would be Classname 
 * two ways 1)make the variable as a static or 2) create an Object for the
 * variable class and access through the Object.common pool 
 * ***************IMP*************
 * we can only write public for one class , we can  not create two public classes 
 * either inner class or main class should have only one Public , the other one is default. 
 */