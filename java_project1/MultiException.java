package java_project1;

public class MultiException {

	static void divide() {
		int a=52;
		//int b=0;
		int b=2;
		int arr[] = new int[2];
		try {
			int c=a/b;
//			String str=null;
//			System.out.println(str.length());
			arr[3]=26;
			System.out.println(c);
		}
		catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
//		catch(ArrayIndexOutOfBoundsException ae) {
//			System.out.println(ae);
//			
//		}
		catch(Exception e) {
			System.out.println("Undefined Exceptions Occured.");
		}
		
	}
	
	public static void main(String[] args) {
		divide();
	}
	
}
