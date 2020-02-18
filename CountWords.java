//Ghadir Alfadhl
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CountWords
{
  public static void main(String[] args)
  {
     String name;
     char c;
     int stringLength;
     int i;
     int wordCount = 0;
     int lCount = 0;
     int lastPos;
     name = JOptionPane.showInputDialog(null, "Enter a sentence or any words");
     stringLength = name.length();
     lastPos = stringLength;
     for(i = 0; i < stringLength; i++)
     {
        c = name.charAt(i);
        if(Character.isLetterOrDigit(c))
         lCount = lCount + 1;
        if(lCount > 0 && wordCount == 0);
           wordCount = 1;
        if(lCount > 0)
            if(c == ' ' || c == '.' || c == '-' || c == '!' || c == ',' || c == '?' )
            {
                lCount = 0;
                wordCount = wordCount + 1;
                if(lastPos == i + 1)
                    if(c == ' ' || c == '.' || c == '-' || c == '!' || c == ',' || c == '?' )
                        wordCount = wordCount - 1;
            
            }
        }
        if(wordCount > 0)
            System.out.println("You have typed  " + wordCount + " words");
        else
            System.out.println("You have typed no words");
                
  }
}