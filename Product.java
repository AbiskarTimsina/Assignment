
public class Product {
	public Product(int Id,Double weights) {
		switch (Id) {
		case 12:
			FreshFruits c12 = new FreshFruits("Apples",weights,12,2.6,0); //acc to id passing params as (name,weight,id.price,tax)
			break;
		case 13:
			FreshFruits c13 = new FreshFruits("Grapes",weights,13,1.5,0);
			break;
		case 14:
			FreshFruits c14 = new FreshFruits("Bananas",weights,14,3.5,0);
			break;
		case 15:
			FreshFruits c15 = new FreshFruits("Papayas",weights,15,4.45,0);;
			break;
		case 16:
			FreshFruits c16 = new FreshFruits("Oranges",weights,16,2.65,0);
			break;
		case 22:
			Packaged c22 = new Packaged("Sausages",16,2.65,0.1);
			break;
		case 23:
			Packaged c23 = new Packaged("Bread",16,2.65,0.1);
			break;
		case 24:
			Packaged c24 = new Packaged("Canned Tune",16,2.65,0.1);
			break;
		case 25:
			Packaged c25 = new Packaged("Chicken",16,2.65,0.1);
			break;
		case 26:
			Packaged c26 = new Packaged("Pork",16,2.65,0.1);
			break;
			
		default:
			System.out.println("Item not available");
		}
	}

}
