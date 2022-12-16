import java.util.Scanner;

class PromoCode extends Cart {// exception handling 
	static Scanner input= new Scanner(System.in);
	private static String code;
	public void Promo() {
		
		System.out.println();
		System.out.print("Please type in a promo code for a discount.  *(FIRST TIME USERS MAY USE CODE \"TCP\")* :");
		code=input.nextLine();
		if (code.equalsIgnoreCase("TCP")) {
			PromoCode.applyPromo();
		
		}
		else {
			System.out.println("Promo code invalid");
			System.out.println("Press \"enter\" to continue scheduling your order");
			input.nextLine();
			PickUpOrDelivery pod= new PickUpOrDelivery();
			pod.whichOne();
		}
		
	
		
			
			
		}
	
	private static void applyPromo() {
		System.out.println();
		System.out.println("Promo code for 50% discount applied!!\n");
		if (enter.equalsIgnoreCase("pick")) {
			System.out.println("Your new total is: $"+ (formatter.format(total/2)));
			PickUpOrDelivery pod= new PickUpOrDelivery();
			pod.whichOne();
		}
		else {
		System.out.println("Your new total is " + (formatter.format(deliveryTotal/2)));
		System.out.println();
		System.out.println("Press \"enter\" to continue scheduling your order");
		code=input.nextLine();
		PickUpOrDelivery pod= new PickUpOrDelivery();
		pod.whichOne();
	
		}
		
		
		
	}
}// end of class
