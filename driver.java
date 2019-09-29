import java.util.Scanner;

public class driver {
	static Scanner inp = new Scanner (System.in);
	public static void main (String args[])
	{
		double weight = 0;
		System.out.println("Fresh Fruits:                 "+ "Packed Products:");
		System.out.println("Item:"+"             Id: "+"|"+"      Item:"+"             Id: ");
		System.out.println("Apples:"+"           12"+"  |"+"      Sausages:"+"         22");
		System.out.println("Grapes:"+"           13"+"  |"+"      Bread:"+"            23");
		System.out.println("Bananas:"+"          14"+"  |"+"      Canned Tuna:"+"      24");
		System.out.println("Papayas:"+"          15"+"  |"+"      Chicken:"+"          25");
		System.out.println("Oranges:"+"          16"+"  |"+"      Pork:"+"             26");
		while (true){
		System.out.format("\n");
		System.out.print ("--->   Enter the id of the product you want to purchase: ");
		int id = inp.nextInt();
		if (id >10 && id <20) // because only fruits need weights.
		{
		System.out.print ("Enter the weight: ");
		weight = inp.nextDouble();
		}
		System.out.format("\n");
		Product x = new Product(id,weight); //calling the constructor product.
		System.out.format("\n");
		System.out.println("__________________________________");
		System.out.print("Do you wish to buy more things[y/n]: ");
		char ch = inp.next().charAt(0);//taking only char input from input strings.
		if (ch == 'n') {
			System.out.println("Thank you for shopping with us."); 
			break;
		}
		}
		}
}
