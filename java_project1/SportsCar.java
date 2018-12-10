package java_project1;

public class SportsCar extends Car{
	String fuelName="abcSports";
	/*
	public void move()
	{
		System.out.println("Inside MOVE method in SportsCar");
	}
	*/
	public int capacity() {
		System.out.println("Inside CAPACITY method in SportsCar");
		return 2;
	}

	public String fuel() {
		return fuelName;
	}
	
	public String task() {
		String o2 = new String();
		return o2;
	}
	
	
}
