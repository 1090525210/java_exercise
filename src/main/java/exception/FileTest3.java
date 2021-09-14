package exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//字符流 finally
public class FileTest3 {
	public static void main(String[] args) throws IOException{
		Reader reader = null;
		Writer writer = null;
		try {
			File readFile= new File("D:/Java/Input.txt");
			reader = new FileReader(readFile);
			File writeFile = new File("D:/Java/Output.txt");
			writer = new FileWriter(writeFile);
			
			char[] byteArray = new char[(int) readFile.length()];
			reader.read(byteArray);
			writer.write(byteArray);
			writer.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			reader.close();
			writer.close();
		}
	}
}
