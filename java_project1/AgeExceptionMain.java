package java_project1;

import java.util.Scanner;

public class AgeExceptionMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age=scanner.nextInt();
		scanner.close();
		try {
			if(age<18) {
				
				throw new AgeException("Invalid Age");
			
			}
			else
				System.out.println("Valid Age");
		}
		catch(AgeException a){
			System.out.println(a);
		}
		//scanner.close();
	}

}
