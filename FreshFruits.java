public class FreshFruits {
	public FreshFruits(String item,double weight,int id,double price,double tax) {
		double totprice = weight * price;  
		System.out.format("Item: %s \nWeight: %.2f \nPrice/unit: %.2f \ntax: %.2f\nTotal Price: %.2f ", item,weight,price,tax,totprice);
	
	}
}
