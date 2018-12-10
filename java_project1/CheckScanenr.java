package java_project1;

import java.util.Scanner;

public class CheckScanenr {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lowerCharCount=0;
		int upperCharCount=0;
		//while(true) {
			System.out.println("what is your name?");
			String input = scanner.nextLine();
			
			if(!input.isEmpty())
			{
				//break;
				for(char ch:input.toCharArray()) {
					if(!Character.isDigit(ch) && Character.isAlphabetic(ch))
					{
						if(Character.isUpperCase(ch))
						{
							upperCharCount++;
						}
						if(Character.isLowerCase(ch))
						{
							lowerCharCount++;
						}
					}
				}
			}
			else {
				System.out.println("please enter any name");
			}
			
			System.out.println("Number of Upper case in your given Name is "+upperCharCount);
			System.out.println("Number of Lower case in your given Name is "+lowerCharCount);
			
		//}
		scanner.close();
		
		
	}

}
