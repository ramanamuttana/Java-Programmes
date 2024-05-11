package org.demo.chapter1;

public class DefaultConstructorCallingMethods {
	int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String [] args){
		// with the default constructor we can create the object and call the methods through the object.
		DefaultConstructorCallingMethods def1=new DefaultConstructorCallingMethods();
		def1.setX(10);
		def1.setY(20);
		System.out.println(def1.getX());
		
	}
}
