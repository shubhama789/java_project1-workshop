package java_project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
//		String input = "Hi, This is subham! Working on file";
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\subhagar\\Desktop\\java_workspace\\java_project1\\newfile.txt");
//		byte[] arr = input.getBytes();
//		
//		fos.write(arr);
//		fos.close();
//		
//		FileInputStream fis = new FileInputStream("C:\\Users\\subhagar\\Desktop\\java_workspace\\java_project1\\newfile.txt");
//		int i=0;
//		while((i= fis.read())!=-1) {
//			//char j=(char)i;
//			System.out.print((char)i);
//		}
//		//fis.read(arr);
	
		
	
		
		try(FileReader inputStream = new FileReader("sampleinput.txt");
				FileWriter outputStream = new FileWriter("sampleoutput.txt");){
				
			int c;
			while((c=inputStream.read())!=-1) {
				outputStream.write(c);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
		
}
