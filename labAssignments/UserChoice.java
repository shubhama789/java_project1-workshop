package labAssignments;

import java.util.Scanner;

public class UserChoice {
	
	public static void main(String[] args) {
		System.out.println("Please Enter the String in which you want to perform some operations");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		String newString=input;
		System.out.println("Operations that you can perform on this string are: ");
		System.out.println("1. Add the String to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters in the String");
		System.out.println("4. Change odd characters to upper case\n");
		System.out.println("Please Enter one of the above option");
		Scanner scanner1 = new Scanner(System.in);
		int option = scanner1.nextInt();
		scanner.close();
		scanner1.close();
		
		
		switch (option) {
		case 1:
			newString = input+input;
			//newString.
			System.out.println("Concatinated String with itself is : "+newString);
			break;
		case 2:
			ReplaceOddWithHash hash = new ReplaceOddWithHash();
			hash.replaceOddWithHash(newString);
			break;
		case 3:
			
			break;
			
		default:
			break;
		}
		
	}
}
