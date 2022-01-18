package tenthchapter.examplefive;

public class EnglishSpeakingWorld {
	
	String mars=" redPlanet";

	public static void main(String[] args) {
		new EnglishSpeakingWorld ().visitPennsylvania();
	}
	
	void visitPennsylvania() {
		String mars=" jamestown";
		
		System.out.println("mars from method : "+mars );
		System.out.println("mars from global variable :"+this.mars );
	}

}
