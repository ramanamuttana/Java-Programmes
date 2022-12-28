package org.chapter4;

import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Problem78 {

    //Local variable Type Inference (LVTI) 
	
	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
		Problem78  problem78=new Problem78();
		Object obj1=problem78.fetchTransferableData("ram");
		System.out.println(obj1.toString());
		Object obj2=problem78.fetchTransferableData("sam");
		System.out.println(obj2.toString());
	}
	
	public Object fetchTransferableData(String data) throws UnsupportedFlavorException,IOException {
			
		// var ss inspite of ss --make as reasonable name  like stringSelection
		
		var stringSelection =new StringSelection(data); // each time  the new object is created with new string as a parameter is added 
		var dataFlavoursArray =stringSelection.getTransferDataFlavors(); // add the object to the DataFlavour  array 
		var obj=stringSelection.getTransferData(dataFlavoursArray[0]);  // get the first object 
		return obj;	
	}

}
