package constructors;

public class Simplyfythedefaultcon {

	private int x, y;

	public Simplyfythedefaultcon(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static void main(String[] args) {
		// no default constructor and setting the variable only through
		// constructor
		Simplyfythedefaultcon def2 = new Simplyfythedefaultcon(10, 30);
		System.out.println(def2.getX());
	}

}
