import java.util.Scanner;
public class CondoSales
{
   public static void main (String args[])
   {
      int selection;
      int price;
      String result;
      final int PARK = 1, GOLF = 2, LAKE = 3;
      final int PARK_PR = 150000, GOLF_PR = 170000,
         LAKE_PR = 210000;
      final String PARK_STR = "Park view",
                   GOLF_STR = "Golf course view",
                   LAKE_STR = "Lake view",
                   INVALID_STR = "\nInvalid selection";
      Scanner in = new Scanner(System.in);
      System.out.println("\nMenu\n");
      System.out.println("(1) " + PARK_STR);
      System.out.println("(" + GOLF + ") " + GOLF_STR);
      System.out.println("(" + LAKE + ") " + LAKE_STR);
      System.out.print("Enter Selection (1, 2, or 3)>> ");
      selection = in.nextInt();
      if(selection == PARK)
      {
         result = PARK_STR;
         price = PARK_PR;
      }
      else
         if(selection == GOLF)
         {
            result = GOLF_STR;
            price = GOLF_PR;
         }
         else
            if (selection == LAKE)
            {
                result = LAKE_STR;
                price = LAKE_PR;
            }
            else
            {
                result = INVALID_STR;
                price = 0;
             }
      System.out.println("You selected " + result + "  $" + price);
      in.close();
   }
}
