package org.chapter4;

public class Problem80 {
	
	// the example is changed according to the  topic 

	public static void main(String[] args) {
		var purchasedValue =Problem80.purchaseCart(12345);
		System.out.println(purchasedValue);

	}
	
	public static float purchaseCart(long customerId) {
		
		// if both are var , even if we send interger it will accept inspite of float 
	//	var price=10.98F; // in this case it will accept both float and int values 
		var price=10;
		return price;
	}
}
