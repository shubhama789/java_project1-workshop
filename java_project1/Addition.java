package java_project1;

public class Addition {
	
		
	int num1=56,num2=34;
		void add()
		{
			
			int result;
			result=num1+num2;
			System.out.println("Result is: "+result);
		}
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add();
	}
}


