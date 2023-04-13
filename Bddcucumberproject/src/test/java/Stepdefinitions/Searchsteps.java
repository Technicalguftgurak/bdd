package Stepdefinitions;

import AmazonImplementatiuons.Product;
import AmazonImplementatiuons.Searchclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Searchsteps 
{
	Product product;
	Searchclass search;
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() 
	{
	    System.out.println("step 1: i am on search page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) 
	{
	System.out.println("step 2: search the product with name : " + productName + " price: " + price);
	//call constructor
	product=new Product(productName , price);
	}

	@SuppressWarnings("deprecation")
	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("step 3: product " + productName + "is displayed");
		
		search=new Searchclass();
		String name=search.displayProduct(product);
		System.out.println("search product is:" + name);
		Assert.assertEquals(product.getProductName(), name);
	  
	}
}
