package exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//字符流 try-resources
public class FileTest4 {
	public static void main(String[] args) throws IOException{
		try(Reader reader = new FileReader("D:/Java/Input.txt");
			Writer writer = new FileWriter("D:/Java/Output.txt");) {
			
			File readFile= new File("D:/Java/Input.txt");
			char[] byteArray = new char[(int) readFile.length()];
			reader.read(byteArray);
			writer.write(byteArray);
			writer.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

