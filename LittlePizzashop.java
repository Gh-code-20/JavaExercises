
//Ghadir Alfadhl
import java.util.Scanner;
public class LittlePizzashop {
	public static void main (final String [] args)
	{
		int selection;
		int Pizza;
		int price;
		double sales_Tax = 0.10;
		String result1;
		String result2;
        int price1;
        int price2;
        double total;
		final int Larg_Pizza = 1, Medium_Pizza = 2;
		final int Larg_PR = 11, Medium_PR = 7, 
					pepproni_PR = 1, susage_PR = 2;
		final int pepproni = 1, susage = 2;


		Scanner input = new Scanner(System.in);
		System.out.println("\nMenu");
        System.out.println("(1) Larg_Pizza " + "\n(2) Medium_Pizza");
		System.out.print("Enter Selection for your Pizza size (1 or 2)>> ");
		selection = input.nextInt();
		System.out.println("\nMenu");
        System.out.println("(1) pepproni " + "\n(2) susage");
		System.out.println("Enter Selection for your Pizza type (1 or 2)>> ");
		Pizza = input.nextInt();

		if(selection == Larg_Pizza)
		{ 
			result1 = "Large Pizza";
			price1 = Larg_PR; }		
		else 	
			if(selection == Medium_Pizza)
			{ 
				result1 = "Medium Pizza";
				price1 = Medium_PR;
			}
				
        else
			{
				result1 = "You entered an incorrect choice, please try again.";
				price1 = 0;
			} 
						  
		if(Pizza == pepproni)
     	{
			result2 = "Pepproni";
			price2 = pepproni_PR;
         }
		else 
			if(Pizza == susage)
			{
				result2 = "Susage";
				price2 = susage_PR;
			}
            
		else
			{
				result2 = "Cheese";
				price2 = 3;
			}
		price = price1 + price2;
        sales_Tax = price * 0.10;
		total = price + sales_Tax;  	
		System.out.println("Your order:\n" + result1 + 
			"\n" + result2 + "\nCost: $" + price + "\nSales_Tax: " + sales_Tax);  
    System.out.println("Your total price is: $" + total); 
    input.close();
			
	}
}