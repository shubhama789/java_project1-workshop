package java_project1;

public class SwitchExample {

	public static void main(String[] args) {
		String currentDay = args[0];
	switch(currentDay) {
		case "MONDAY":
			System.out.println("Today is Monday");
			break;
		case "TUESDAY":
			System.out.println("Today is Tuesday");
			break;
		case "WEDNESDAY":
			System.out.println("Today is Wednesday");
			break;
		case "THRUSDAY":
			System.out.println("Today is Thrusday");
			break;
		case "FRIDAY":
			System.out.println("Today is Friday");
			break;
		case "SATURDAY":
			System.out.println("Today is Saturday");
			break;
		case "SUNDAY":
			System.out.println("Boring day");
			break;
			default:
				System.out.println("Please Check the Day Entered");
	}
	}
}
