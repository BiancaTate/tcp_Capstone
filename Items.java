import java.util.*;

public class Items {
	protected static ArrayList completeCart;
	protected static ArrayList itemPrices;
	
	public static void viewItems() {
		Scanner input= new Scanner(System.in);
		int count=1;
		Cart a = new Cart();

		
		System.out.println();
		
		completeCart = new ArrayList(); // final items chosen for cart 
		itemPrices= new ArrayList();// price of final items chosen for cart 
		
		
		Inventory x = new Inventory();
		
		
		System.out.println(("Your personalized food list with prices:").toUpperCase());
		System.out.println();
		
		x.combined2.forEach(System.out::println);
		System.out.println("\n\n");
		System.out.println("Please choose which items you would like to add to your cart.You may type \"done\" when you are finished.\n");
		System.out.println("Press \"enter\" to begin.\n");
		String add=input.nextLine();
		
		
		
			for (int i=0; i<= x.combined2.size();i++) {
			System.out.print("Choice " + count+ " :");
			add = input.nextLine();
			add=add.toUpperCase();
			if(add.equalsIgnoreCase("done")){
				
				break;
			}
			else if (!x.combined.containsKey(add)) { // referencing hash map with diet options
				System.out.println("*item not found*");
			}
			
			else {
				completeCart.add(add);
				Double val = (Double)x.combined.get(add);
				itemPrices.add(val); // adding prices of item to an array list
				
				count++;		
			}
			 
		}// end of for statement
		
		
		System.out.println();		
		System.out.println("Press \"enter\" to view your cart.");
		add=input.nextLine();
		a.cartItems();
		
	
		
		
		
		
		
		
		
		
		
	}
 
}
