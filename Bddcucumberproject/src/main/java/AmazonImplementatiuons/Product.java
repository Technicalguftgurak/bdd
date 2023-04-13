package AmazonImplementatiuons;

import java.util.*;

public class Product 
{
	//private encapsulation
private String productName;
private int price;
//make a constructor
public Product(String productName, int price) {
	super();
	this.productName = productName;
	this.price = price;
}
//getter & setter methods
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
//give list of product using arrayList 
public List<String> getProductList()
{
	List<String> productList = new ArrayList<>();
	productList.add("Apple macbook pro");
	productList.add("Apple macbook Air");
	productList.add("Apple Iphone 12");
	return productList;
}

}
