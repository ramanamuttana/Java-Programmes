package MainJava;

public class GenStackTest {

	public static void main(String[] args) {
		//creating the object of the Generics class
		Generics<String> gs =new Generics<String>();
		System.out.println("Pushing four items");
		gs.push("one");
		gs.push("Two");
		gs.push("Three");
		gs.push("Four");
		System.out.println("Items in the size " +gs.size()+" items in the stack.\n");
		String E = null;
		System.out.println("first item is :"+gs.peek(E));
	
		while(gs.hasItems())
		//pop which removes all the elements
		System.out.println( gs.pop(E));
		//after removing the elements 
		System.out.println("first item is :"+gs.peek(E));
		System.out.println("Items in the size " +gs.size()+" items in the stack.\n");
		

	}

}
