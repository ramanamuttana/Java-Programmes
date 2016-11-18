package practicedone;

public class EqualsStirngs {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String(s1);
		String s3="Goodbye";
		String s4="HELLO";
		System.out.println(s1+" equals "+s2+"-->"+s1.equals(s2) );
		System.out.println(s1+" == "+s3+"-->"+(s1==s3));

	}

}
