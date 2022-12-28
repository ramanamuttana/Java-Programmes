package org.chapter4;

import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Problem78 {

	

	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
		Problem78  problem78=new Problem78();
		Object obj1=problem78.fetchTransferableData("ram");
		System.out.println(obj1.toString());
		Object obj2=problem78.fetchTransferableData("sam");
		System.out.println(obj2.toString());
	}
	
	public Object fetchTransferableData(String data) throws UnsupportedFlavorException,IOException {
			
		var ss =new StringSelection(data); // each time  the new object is created with new string as a parameter is added 
		var df =ss.getTransferDataFlavors(); // add the object to the DataFlavour  array 
		var obj=ss.getTransferData(df[0]);  // get the first object 
		return obj;	
	}

}
