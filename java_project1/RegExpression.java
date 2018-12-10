package java_project1;

//import java.lang.reflect.Parameter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
	
	static void nameCheck(String name) {
		//String name
		Pattern pattern1 = Pattern.compile("[A-Z][a-z]{2,6}");
		Matcher match = pattern1.matcher(name);
		System.out.println(match.matches());
	}
	static void numberCheck(String number) {
		//String name
		Pattern pattern1 = Pattern.compile("[6-9][0-9]{9}");
		Matcher match = pattern1.matcher(number);
		System.out.println(match.matches());
	}
	static void emailCheck(String email) {
		//String name
		Pattern pattern1 = Pattern.compile("[a-zA-Z]([a-zA-Z0-9\\.]+)[@Capgemini.com]");
		Matcher match = pattern1.matcher(email);
		System.out.println(match.matches());
	}

	
	public static void main(String[] args) {
		/*
		String input = "Shop,Mop,Hopping,Chopping";
		Pattern pattern = Pattern.compile("hop");
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.matches());
		while(matcher.find()) {
			System.out.println(matcher.group()+":"+matcher.start()+":"+matcher.end());
		}
		*/
		nameCheck("Subham");
		numberCheck("9547909577");
		emailCheck("subham.a.agarwal06876@Capgemini.com");
	}

}
