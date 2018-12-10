package java_project1;

public class Car2 implements Vehicle1,Vehicle2{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("this is a overridden speed method in Car2");
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("this is a overridden fuel method in car2 ");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("this is an overridden brake method in Car2");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("this is an overridden accelerate method in Car2");
	}

	@Override
	public void dum() {
		// TODO Auto-generated method stub
		System.out.println("dumdumdumdum");
	}
	
	 public void any() {
		 System.out.println("this is an ANY method in Car2 class with public access specifier");
	 }
	 
	 public void any1() {
		 System.out.println("this is an ANY1 method in Car2 class with public access specifier");
	 }
	 
}
