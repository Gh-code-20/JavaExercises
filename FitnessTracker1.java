
public class FitnessTracker1 
{
    String activaty;
    String client;
    double minutes1;
    double minutes2;
    double avrage;

    public FitnessTracker1()  
    {
        activaty = "running";
        client = "Ghadir Alfadhl";
        minutes1 = 25;
        minutes2 = 10;
        avrage = (minutes1 + minutes2) / 2;

    }
    // ex 3b pg225 Overloaded 
    public FitnessTracker1(String a, String c, double m1, double m2) 
    {
        activaty = a;
        client = c;
        minutes1 = m1;
        minutes2 = m2;
        avrage = (m1 + m2) / 2;
        
        
    }
    public String getClient()
     {
         return client;
     }
    public String getActivaty() 
     {
         return activaty;
     }

    public double getMinutes1()
     {
         return minutes1;
     }
    public double getMinutes2()
     {
         return minutes2;
     }
    public double getAvrage()
     {
         return avrage;
     }

    
}

