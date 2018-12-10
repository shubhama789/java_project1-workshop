package filesRelatedProduct;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ProductMain {

		public static void main(String[] args) throws IOException {
			
			try(FileOutputStream fos = new FileOutputStream("product");
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				
				Product product = new Product(1,"dove",34);
				
				oos.writeObject(product);
				
				

				
			
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			try(FileInputStream fis = new FileInputStream("product");
					ObjectInputStream ois = new ObjectInputStream(fis);) {
					
					Product p1 = (Product) ois.readObject();
					
					System.out.println(p1);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				
			
		}
}
