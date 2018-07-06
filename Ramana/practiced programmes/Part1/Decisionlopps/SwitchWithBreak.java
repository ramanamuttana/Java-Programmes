package Decisionlopps;

public class SwitchWithBreak {

	static int value = 3;

	// directly executing the third case which saves the runtime
	public static void main(String[] args) {

		switch (value) {

		case 1:
			System.out.println("it is matched to one ");
			break;
		case 2:
			System.out.println("it is matched to two ");
			break;
		case 3:
			System.out.println("it is matched to three ");
			break;
		default:
			System.out.println("it matched to default");
		}
	}
}
