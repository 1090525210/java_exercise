package exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//字节流 try-with-resources
public class FileTest2 {
	public static void main(String[] args) throws IOException{
		try(InputStream input = new FileInputStream("D:/Java/Input.txt");
				OutputStream output= new FileOutputStream("D:/Java/Output.txt");){
			byte[] buf = new byte[4];
			int hasRead =0;
			while((hasRead=input.read(buf))>0) {
				output.write(buf,0,hasRead);
			}
			System.out.println("Success!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}