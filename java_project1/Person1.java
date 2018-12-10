package java_project1;


public class Person1 {

	private String firstName;
	private String lastName;
	//private char gender;
	private long phoneNumber;
	
	enum Gender{M,F}
	Gender gender;
	
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public Person1(String fn,String ln,Gender gndr)
	{
		setFirstName(fn);
		setLastName(ln);
		setGender(gndr);
		
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	void showPhoneNumber(){
		System.out.println("Phonenumber is : "+getPhoneNumber());
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
