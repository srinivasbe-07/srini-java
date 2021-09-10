package playjavaTrickyQuestion.java8.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	private int productId;
	private String productName;
	private float price;
	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
public class FilterDemo4 {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Samsung", 3000));
		productList.add(new Product(1, "sony", 2000));
		productList.add(new Product(1, "LG", 1000));

		productList.add(new Product(1, "Samsung", 1500));

		productList.add(new Product(1, "Mi", 6000));

		productList.add(new Product(1, "sony", 2500));

		productList.add(new Product(1, "oppo", 3500));

		productList.add(new Product(1, "Samsung", 1000));

		productList.add(new Product(1, "mi", 2200));

		productList.add(new Product(1, "sony", 3100));
		
		List<String> pros = productList.stream().filter(p-> p.getPrice() > 2500).map(p->p.getProductName()).collect(Collectors.toList());

		System.out.println(pros);
	}
	
	
}
