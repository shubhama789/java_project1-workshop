package lab3;

import java.util.Scanner;

public class CheckString {
	void pString(String input)
	{
		int count=0;
		char[]array=input.toCharArray();
		for(int i=1;i<array.length;i++) {
			if((Character.toLowerCase(array[i-1])>(Character.toLowerCase(array[i]))))
count++;
}
if(count==0) {
	System.out.println("String is +ve");
}
else
	System.out.println("String is -ve");
}
	public static void main(String[] args) {
		CheckString cs=new CheckString();
		String input;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	input=sc.nextLine();
	cs.pString(input);
	}
				
}
