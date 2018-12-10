package java_project1;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			String str = args[0];
			
			File file = new File(str);
			file.createNewFile();
			System.out.println(file.getName());
			System.out.println(file.getParent());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());
			System.out.println(file.canRead());
			
	}

}
