package java_project1;

public class IfElse {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=30;
		int largest;
		
		if(num1>num2) {
			largest=num1;
		}
		else {
			largest=num2;
		}
		if(num3>largest) {
			largest=num3;
			
		}
		
		
		
		System.out.println("Largest number is: "+largest);
	}
}


