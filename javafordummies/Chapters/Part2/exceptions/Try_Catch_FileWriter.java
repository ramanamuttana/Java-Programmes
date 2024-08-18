package exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Try_Catch_FileWriter {

	public static void main(String[] args) {
		// creating and writing to the file using tray and catch
		// file will be saved inn the Files folder 
		try {
			File file = new File("FilenameRam.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("Hi How are u");
			pw.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
