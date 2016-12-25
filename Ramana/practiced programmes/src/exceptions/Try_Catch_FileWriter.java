package exceptions;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Try_Catch_FileWriter {

	public static void main(String[] args) 
	{
	try
	{
	   File file = new File("FilenameRam.txt");
	if(!file.exists())
	{
		file.createNewFile();
	}
		PrintWriter pw=new PrintWriter(file);
		pw.println("Hi How are u");
		pw.close();
		System.out.println("Done");		
	}catch(IOException e)
	{
	e.printStackTrace();
	}
	}
	}
