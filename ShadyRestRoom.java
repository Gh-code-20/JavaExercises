import java.util.Scanner;
public class ShadyRestRoom
{
   public static void main (String[] args)
   {
      int Select;
      int price;
      String result;
      final int Queen = 1, King = 2, KingAndPullout = 3;
      final int Queen_PR = 125, King_PR = 165,
                KingAndPullout_PR = 139;
      final String Queen_R = "Queen ",
                   King_R = "King ",
                   KingAndPullout_R = "King and Pullout",
                   INVALID_R = "Invalid selection";
      Scanner input = new Scanner(System.in);
      System.out.println("\nMenu\n");
      System.out.println("(1) " + Queen_R + "\n(2) " + King_R + 
                                    "\n(3) "+ KingAndPullout_R);

      System.out.print("Enter Selection (1, 2, or 3)>> ");
      Select = input.nextInt();
      if(Select == Queen)
      {
         result = Queen_R;
         price = Queen_PR;
      }
      else
         if(Select == King)
         {
            result = King_R;
            price = King_PR;
         }
         else
            if (Select == KingAndPullout)
            {
                result = KingAndPullout_R;
                price = KingAndPullout_PR;
            }
            else
            {
                result = INVALID_R;
                price = 0;
             }
      System.out.println("Your Selection " + result + "  $" + price);
      input.close();
   }

}
