package labAssignments;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in) ;
			System.out.println("Enter your First Name");
			String firstName = scanner.nextLine();
			System.out.println("Enter your Last Name");
			String lastName = scanner.nextLine();
			System.out.println("Enter your Gender");
			char gender = scanner.next().charAt(0);
			
		Person person = new Person(firstName,lastName,gender);
		try {
			if(person.getFirstName().length()==0 && person.getLastName().length()==0)
			{
				throw new NameException("Invalid Full Name");
			}
			else {
				person.showDetails();
			}
		}
		catch (NameException e) {
			// TODO: handle exception
			System.out.println("Thrown Exception is : "+e);
		}
			//person.setPhoneNumber(954790957);
			
			//person.showPhoneNumber();
			
			
		}

}
