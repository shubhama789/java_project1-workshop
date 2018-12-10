package java_project1;

public class Fibonacci {
	public static void fibonacci(int n)
	{
		int num=n;
		int num1=0;
		int num2=1;
		int sum=0;
		//System.out.print(num1);
		for(int i=0;sum<=num;i++) {
			
			if(i!=0) {
				System.out.print(","+sum);
			}
			else {
				System.out.print(sum);
				}
			sum=num1+num2;
			num1=num2;
			num2=sum;	
		}
	}
	public static void main(String[] args) {
		int limit=Integer.parseInt(args[0]);
		fibonacci(limit);
		
	}
	

}
