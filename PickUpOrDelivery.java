import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PickUpOrDelivery extends Cart{
	static Scanner input = new Scanner(System.in);
	
	public static void whichOne() {
		
		
		if (enter.equalsIgnoreCase("pick")) { // user choice for pick up or delivery
			pickUp();
		}
		else if (enter.equalsIgnoreCase("deliver")) {
			Deliver();
		}
	}
	
	public static void pickUp(){
		System.out.println();
		System.out.print("In how many days would you like to receive your order? :");
		
		int days =input.nextInt();
		
		
		LocalDate today = LocalDate.now();// todays date
	    LocalDate customDate = today.plusDays(days);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern(" MMM dd, yyyy"); // instance of DateTimeFormatter class
	    
		
		
		
		
		if (days<= 0) {
			System.out.println();
			System.out.println("Invalid");
			System.out.println("Number must be greater than zero.");
			PickUpOrDelivery.pickUp();
		}
		else {
			
	
		System.out.println();
		System.out.print("Type a pick-up/delivery time bewteen   *(Enter time in hh:mm:ss format)* : ");
		String time=input.next();  //default format: hh:mm:ss 
		LocalTime lt=LocalTime.parse(time); // object for local time
		
		
		System.out.println();
		System.out.println("Your order will be ready in \"" +days+ "\" days on\"" +customDate.format(myFormatObj) + "\" at \"" + lt + "pm.");
		
	 

		
		
		}
		
		
	}
	

	
	public static void Deliver() {
		System.out.println();
		System.out.println("Please enter the shipping address");
		String address= input.nextLine();
		PickUpOrDelivery.pickUp();
		System.out.print("Delivered to address \""+ address+"\"");
		System.out.println("\nThank you for shopping with us!");
		
		 
	}
		
		
	

}// end of class 
