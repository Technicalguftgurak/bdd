package AmazonImplementatiuons;

public class Searchclass 
{
public String displayProduct(Product product)
{
	if (product.getProductList().contains(product.getProductName()))
{
		return product.getProductName();
				}
	return null;
}
}
