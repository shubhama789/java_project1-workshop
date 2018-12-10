package java_project1;

public class Car {
	
	String fuelName="xyz";

	public final void move() {
		
		System.out.println("Inside MOVE method in Car");
	}
	
	public int capacity() {
		System.out.println("Inside CAPACITY method in Car");
		return 0;
	}
	public String fuel() {
		return fuelName;
	}
	
	public Object task() {
		Object o1 = new Object();
		return o1;
	}
	
	
	
	
}
