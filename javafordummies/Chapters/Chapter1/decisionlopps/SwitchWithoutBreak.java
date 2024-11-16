package decisionlopps;

public class SwitchWithoutBreak {

	static final int value = 2;

	/** directly executing the first  case which saves the runtime
	 *  executing without break which shows the execution of all case statements 
	 * @param args
	 * if it is 1 then it will run all the cases , if it 3 only 3 and default will run .
	 */
	
	public static void main(String[] args) {

		switch (value) {

		case 1:
			System.out.println("it is matched to one ");
		case 2:
			System.out.println("it is matched to two ");
		case 3:
			System.out.println("it is matched to three ");

		default:
			System.out.println("it matched to default");
		}
	}
}
