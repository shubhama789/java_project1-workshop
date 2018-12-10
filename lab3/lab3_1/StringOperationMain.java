package lab3.lab3_1;

import java.util.Scanner;

public class StringOperationMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add string to itself");
		System.out.println("2.Replace odd positions");
		System.out.println("3.Remove odd positions");
		System.out.println("4.changing odd characters to upper case");
		System.out.println("Enter choice");
		int ch=sc.nextInt();
		StringOperation obj=new StringOperation();
		
		switch(ch)
		{
		case 1:obj.concat();
		break;
		case 2:obj.replace();
		break;
		case 3:obj.duplicate();
		break;
		case 4:obj.odd();
		break;
		}
	}

}
