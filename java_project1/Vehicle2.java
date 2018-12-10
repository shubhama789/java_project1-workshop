package java_project1;

public interface Vehicle2 extends Vehicle3,Vehicle4{
	void brake();
	
	default void any() {
		System.out.println("this is a ANY method inside Vehicle2 with default");
	}
	
}
