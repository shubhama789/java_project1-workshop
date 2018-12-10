package lab3.lab3_7;

public class Person {

	private String firstName;
	private String lastName;
	private char gender;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public Person() {
		this("Subham","Agarwal",'M');
		System.out.println("Showing Person's Details from calling parameterized Constructor through Default Constructor\n");
		// TODO Auto-generated constructor stub
	}
	public Person(String fn,String ln,char gndr)
	{
		setFirstName(fn);
		setLastName(ln);
		setGender(gndr);
		
	}
	
	public void showDetails() {
		System.out.println("Person Details");
		System.out.println("______________");
		System.out.println();
		System.out.println("First Name:"+getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("Gender: "+getGender());
	}
	
}
