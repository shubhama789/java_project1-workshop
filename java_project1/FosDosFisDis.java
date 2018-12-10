package java_project1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FosDosFisDis {

		
	public static void main(String[] args) throws IOException {
		
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\subhagar\\Desktop\\java_workspace\\java_project1\\newfile1.txt");
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
		
		//byte[] arr = dataOutputStream.getBytes();
		
		dataOutputStream.writeBytes("hiii");
		dataOutputStream.writeDouble(Double.MIN_VALUE);
		
		FileInputStream inputStream = new FileInputStream("C:\\Users\\subhagar\\Desktop\\java_workspace\\java_project1\\newfile1.txt");
		DataInputStream dataInputStream = new DataInputStream(inputStream);
		
		System.out.println(inputStream.read());
		System.out.println(dataInputStream.read());
		
		
		
	}
	
}
