import java.text.NumberFormat;
import java.util.*;

public class Cart extends Items {
	private  static String next;
	private static Double next2;
	private static ArrayList<Integer> newUnits;
	private static ArrayList<Double> newItemPrices;
	protected static Double deliveryTotal;
	public static String enter;
	public static double total;
	public static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	

	
	
	public static void cartItems() {
		System.out.println();
		System.out.println("\t\tCART");
		
		System.out.println("ITEMS:\t\t\t\tPRICES:");
		for (int i= 0; i<=completeCart.size()-1;i++){
			 next = (String)completeCart.get(i); // gets  item names
			 next2 = (Double)itemPrices.get(i); // gets item prices
			System.out.println(next +"\t\t\t\t"+ formatter.format(next2));
		}
		System.out.println();
		Cart.Quantity();
		
			
	}
	
	
	public static void Quantity() { // ask user for desired quantity for each item 
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		newItemPrices=new ArrayList<Double>(); // replacing old price with new one in array list
		newUnits = new ArrayList<Integer>(); // array list to hold input quantity for each item
		
		double y;
		
		System.out.println("Please enter your desired quantity of each item.\n");
		
		for (int i=0;i<=completeCart.size()-1;i++){
		
		System.out.print("How many units of "+completeCart.get(i) + " would you like? ");
		int units = input.nextInt();
		y = units* (Double)itemPrices.get(i); // multiplying price time quantity
		newItemPrices.add(y);
		newUnits.add(units);
			}
		
	
		
		Cart.newQuantity();
		
				
		
		
		
	}// end of Quantity method
	
	public static void newQuantity() {// hold updated quantity and prices 
		System.out.println();
		System.out.println("\t\tUPDATED CART: ");
		System.out.println("ITEMS:\t\tQUANTITY:\t\tPRICES:");
		
		for (int i=0;i<=completeCart.size()-1;i++) {
			
			System.out.println(completeCart.get(i)+"\t\t"+ newUnits.get(i)+"\t\t\t"+ formatter.format(newItemPrices.get(i)));
		}
		
		Cart.totalPrice();
		
	}
	
	public static void totalPrice() {// calculates total price
		Scanner input= new Scanner(System.in);
		PromoCode code= new PromoCode();
		total = 0; 
	      for (int i = 0; i < newItemPrices.size(); i++) {
	            total+= newItemPrices.get(i);
	      }
	      System.out.println();
	      System.out.println("Your cart total is : " + formatter.format(total)+"\n");
	      System.out.println("You may now schedule pick up or delivery.  *($4.00 fee will be added to delivery orders)* \n");
	      System.out.print("Type \"pick\" to schedule pick-up or type \"deliver\" for delivery. ");
	      
	      
	      enter= input.nextLine();
	    
	      if(enter.equalsIgnoreCase("deliver")) {
	      
	    	  System.out.println("Total has been updated to "+ (formatter.format(total+4.00)));
	    	  deliveryTotal=(total+4.00);
	    	  code.Promo();
	     } 
	     else if (enter.equalsIgnoreCase("pick")) {

	    	  code.Promo();
	    	  
	      }
	 
	       
		
		
	}
		
	
	
	

}// end of class 
