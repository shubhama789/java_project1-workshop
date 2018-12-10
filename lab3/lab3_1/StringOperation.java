package lab3.lab3_1;

import java.util.Scanner;

public class StringOperation {
	void concat() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String st=s.nextLine();
		String s2=st.concat(st);
		System.out.println(s2);
	}
	
void replace()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String st=s.nextLine();
	for(int i=0;i<st.length();i++)
	{
		char c=st.charAt(i);
		if(i%2!=0)
		{
			System.out.print("#");
		}
		else
		{
	System.out.print(c);
	}
}
}
void duplicate()
{Scanner s=new Scanner(System.in);
System.out.println("enter string");
String st=s.nextLine();
String s2=new String();
for(int i=0;i<st.length();i++)
{
	for(int j=1;j<st.length();j++) {
		
	
	if(st.charAt(i)!=st.charAt(j))
	{
		char ch1=st.charAt(i);
		if(ch1!=' ')
			s2=s2+ch1;
		st=st.replace(ch1,' ');
	}	
	}
}
System.out.println(s2);
}
void odd()
{
	String str="";
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String st=s.nextLine();
	for(int i=0;i<st.length();i++)
	{
		char c=st.charAt(i);
		if(i%2!=0)
		{
			char c1=Character.toUpperCase(c);
			str=str+c;
		}
		else {
			str=str+c;	
		}
		}
	System.out.println(str);
	}
}
