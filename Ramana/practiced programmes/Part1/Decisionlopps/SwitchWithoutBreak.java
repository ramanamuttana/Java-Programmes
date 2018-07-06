package Decisionlopps;

public class SwitchWithoutBreak {

	static final int value = 1;

	/** directly executing the first  case which saves the runtime
	 *  executing without break which shows the execution of all case statements 
	 * @param args
	 */
	
	public static void main(String[] args) {

		switch (value) {

		case 1:
			System.out.println("it is matched to one ");
			System.out.println("it is matched to one ");
		case 2:
			System.out.println("it is matched to two ");

		case 3:
			System.out.println("it is matched to three ");
			System.out.println("it is matched to one ");

		default:
			System.out.println("it matched to default");
		}
	}
}
