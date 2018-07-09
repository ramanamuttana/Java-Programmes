package decisionlopps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfoundexception {

	public static void main(String[] args) throws FileNotFoundException {
		openfile("/practiced programmes/Files/org.Decisionloops.FileNotFoundException.txt");
	}
	public static void openfile(String name) 
	{ 
		boolean fileOpened=false;
		try
		{
			FileInputStream fs= new FileInputStream(name);
			fileOpened=true;
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace(System.out);
		}
	}

}
