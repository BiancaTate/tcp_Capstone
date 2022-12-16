import java.security.KeyStore.Entry;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Map.*;


public class Inventory {
	private static HashMap<String,Double> keto;
	private static HashMap<String,Double> glutenFree;
	private static HashMap<String,Double> vegan;
	private static HashMap<String,Double> nonDairy;
	private static HashMap<String,Double> allOptions;
	public static ArrayList combined2;
	public static HashMap <String,Double> combined;
	
	public static void Inventory() {
		System.out.println("Dietary Options:");
		System.out.println("Keto\nGluten-free\nVegan\nDairy-Free\n");
		System.out.println();
		
		keto = new HashMap<String,Double>();
		keto.put("STRAWBERRIES",2.50);
		keto.put("GROUND BEEF", 4.00);
		keto.put("SALMON", 6.50);
		keto.put("ALMOND MILK", 2.50);
		keto.put("YOGURT", 1.25);
		keto.put("CHEESE", 3.50);
		
		
		glutenFree = new HashMap<String,Double>();
		glutenFree.put("STRAWBERRIES",2.00);
		glutenFree.put("BANANAS", 3.00);
		glutenFree.put("POTATO", 1.00);
		glutenFree.put("GROUND BEEF", 4.00);
		glutenFree.put("SALMON", 6.50);
		glutenFree.put("ALMOND MILK", 2.50);
		glutenFree.put("YOGURT", 1.25);
		glutenFree.put("CHEESE", 3.50);
		
		
		
		vegan = new HashMap<String,Double>();
		vegan.put("STRAWBERRIES",2.00);
		vegan.put("BANANAS", 3.00);
		vegan.put("POTATO", 1.00);
		vegan.put("WHOLE WHEAT PASTA", 1.50);
		vegan.put("ALMOND MILK", 2.50);
		
		
		nonDairy = new HashMap<String,Double>();
		nonDairy.put("STRAWBERRIES",2.00);
		nonDairy.put("BANANAS", 3.00);
		nonDairy.put("POTATO", 1.00);
		nonDairy.put("WHOLE WHEAT PASTA", 1.50);
		nonDairy.put("GROUND BEEF", 4.00);
		nonDairy.put("SALMON", 6.50);
		nonDairy.put("ALMOND MILK", 2.50);
		
		
		
		Inventory next = new Inventory();
		next.makeChoice();
		
		
		// give user option 
		// will call all arayy lists to display options 
		
		
	}
	
	
	
	
	
	
	
	public static void makeChoice() {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please type the names of your diet options above. You may type \"done\" when you are finished.\n");
		System.out.println("Press \"enter\" to begin.");
		int count=1;
		
		combined= new HashMap<String,Double>();// Hash Map to hold user dietary options choices;
		
		Items items = new Items();
		
		
		
		
		String choice=input.nextLine();
		
		
		int i= 0;
		while(i<=3) {

		if (choice.equalsIgnoreCase("done")) {
			break;
		}
		System.out.print("Choice " + count + ": ");	
		
		choice = input.nextLine();
		switch (choice.toLowerCase()) {
		case "keto":
			combined.putAll(keto);
			count++;
			break;
		case "gluten free":
			combined.putAll(glutenFree);
			count++;
			break;
		case "vegan":
			combined.putAll(vegan);
			count++;
			break;
		case "dairy free":
			combined.putAll(nonDairy);
			count++;
			break;
		
		
		} // end of switch statement 
		}// end of while statement
		
		
		
		
		
		
		
		Set<Map.Entry<String, Double> > entrySet= combined.entrySet();; 
		ArrayList<Map.Entry<String, Double> > newCombined= new ArrayList<Map.Entry<String, Double> >(entrySet);// converting hashmap to array
		
		
		LinkedHashSet linked= new LinkedHashSet<>(newCombined);
		
		combined2= new ArrayList<>(linked); //combined 2 is array without duplicate elements 
		
		
		System.out.println("\n");
	
		
		
		
		items.viewItems();
		
	
		}
	

}// end of class 

	


	
	
	
	
	
	
	
	
	
	
        
    