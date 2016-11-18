package practicedone;

public class Buffer {

			public static void main(String[] args) {
			String s="The value is not found";
			int start=10;
			int end=15;
			char buffer[]= new char[end-start];
			s.getChars(start, end, buffer, 0);
			System.out.println(buffer);

	}

}
