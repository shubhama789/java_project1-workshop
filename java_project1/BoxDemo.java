package java_project1;
import java.util.Scanner;



public class BoxDemo {
	public static void main(String[] args) {
		//Box box = new Box();
		Scanner scanner = new Scanner(System.in);
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		int length = scanner.nextInt();
		scanner.close();
		Box box = new Box(width,height,length);
		//Box box2 = new Box(10.2);
		double result= box.volume();
		System.out.println("volume of box is: "+result);
		//Product product = new Product();
		//product.setProductName("Pen");
		//product.setProductId(1);
		//product.setPrice(2.5);
		//System.out.println(product);
		//System.out.println(product.getProductId());
		//System.out.println(Months.Apr.getDays());
	}

}
