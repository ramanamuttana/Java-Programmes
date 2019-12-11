package StringChanges;

public class String_Builder2 {
	String step1 = "johnson";

  // thie example is without creating an variable 
	public static void wrapp(String stem1) {
		stem1 = stem1 + "first candidate";
	}

	public static void wrapp2(StringBuilder sub) {
		sub.append("first candidate");
	}

	public static void main(String[] args) {
		String s1 = "johnson";
		wrapp(s1);
		System.out.println(s1);
		StringBuilder sub = new StringBuilder("jabedsirji ");
		wrapp2(sub);
		System.out.println(sub);
	}
}
