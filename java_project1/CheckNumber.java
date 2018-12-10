package java_project1;

public class CheckNumber {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		if(number>0) {
			System.out.println(number+" is a Positive Number.");
		}
		else {
			System.out.println(number+" is a Negative Number.");
		}
	}

}
