//Ghadir Alfadhl

import java.util.Scanner;
public class LittlePizzashop {
    public static void main(String[] args) 
    {
        int selection;
        int price;
        String result;
        //double sales_tax = 0.10;
        //double total = 0.0;
        int large_pizza = 1, medium_pizza = 2;
        //int pepperoni = 1, sausage = 2;
        final int large_pizza_PR = 11, medium_pizza_PR = 7;
        final String large_pizza_R = "Large Pizza ",
                    medium_pizza_R = "Medium Pizza ",
                    INVALID_R = "incorrect choice, please try again";
        
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenu\n");
        System.out.println("(1) " + large_pizza_R + "\n(2) " + medium_pizza_R);
        System.out.print("Enter Selection (1 or 2)>> ");
        selection = input.nextInt();
        if(selection == large_pizza)
        {
         result = large_pizza_R;
         price = large_pizza_PR;
        }
        else
            if(selection == medium_pizza)
            {
            result = medium_pizza_R;
            price = medium_pizza_PR;
            }
            else
            {
            result = INVALID_R;
            price = 0;
             }
             
       
        System.out.println("You selected " + result + " \n$" + price);

    }

}