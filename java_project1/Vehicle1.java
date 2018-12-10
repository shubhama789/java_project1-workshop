package java_project1;

public interface Vehicle1 {

	void speed();
	void fuel();
	void brake();
	default void any() {
		System.out.println("this is a ANY method inside Vehicle1 with default");
	}
	static void any1() {
		System.out.println("this is a ANY1 method inside Vehicle1 with static");
	}
}
