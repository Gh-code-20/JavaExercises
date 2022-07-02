import java.time.*;
import java.util.Scanner;
public class RestRoom {
    public static void main(String[] args) {
        
        
        String result;
        int selection;
        int price;
        final int Queen = 1, King = 2, KingAndPullout = 3;
        final int Queen_PR = 125, King_PR = 139, KingAndPullout_PR = 165;
        final String Queen_R = "Queen ", King_R = "King ", KingAndPullout_R = "King and Pullout ", 
                                Invalid_R = " Invalid selection";
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenu\n");
        System.out.println("(1) " + Queen_R);
        System.out.println("(2) " + King_R);
        System.out.println("(3) " + KingAndPullout_R);
        System.out.println("Enter Selection (1, 2, or 3 ) >> ");

        selection = input.nextInt();
        if(selection == Queen)
        {
            result = Queen_R;
          price = Queen_PR;
        }
        else
            if(selection == King){
                result = King_R;
                price = King_PR;

            }
            else 
                if(selection == KingAndPullout)
                {
                    result = KingAndPullout_R;
                    price = KingAndPullout_PR;

                }
                else
                    {
                        result = Invalid_R;
                        price = 0;
              
                    }
        System.out.println(" You select " + result + " $ " + price); 
        input.close();
                   
    }
}
