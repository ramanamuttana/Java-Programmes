package practicedone;

public class Buffer {

	public static void main(String[] args) {
			String s="The value is not found";
			int start=10;
			int end=15;
			char buffer[] = new char[end - start]; // This creates a char array of size 5
                        s.getChars(start, end, buffer, 0); // Copies characters from index 10 to 14 (end is exclusive) into buffer
                        System.out.println(buffer); // Prints the contents of the buffer array
	}
}
