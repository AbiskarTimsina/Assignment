
public class Packaged {
	public Packaged (String item,int id,double price,double tax) {
		double totprice = ((tax*price)+price);
		double tax1 = (tax*price);
		System.out.format("Item: %s \nPrice/unit: %.2f \ntax: %.2f\nTotal Price: %.2f ", item,price,tax1,totprice);
	}
}
