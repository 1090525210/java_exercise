package exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//字节流 try-finally
public class FileTest1 {
	public static void main(String[] args) throws IOException{
		InputStream input =null;
		OutputStream output =null;
		try {
			input = new FileInputStream("D:/Java/Input.txt");
			output= new FileOutputStream("D:/Java/Output.txt");
			
			byte[] buf = new byte[4];
			int hasRead =0;
			while((hasRead=input.read(buf))>0) {
				output.write(buf,0,hasRead);
			}
			System.out.println("Success!");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			input.close();
			output.close();
		}
	}
}
