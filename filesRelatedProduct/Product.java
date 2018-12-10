package filesRelatedProduct;

import java.io.Serializable;

public class Product implements Serializable{
	
	private int productId;
	private String productName;
	private double productPrice;
	
	
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	

}
