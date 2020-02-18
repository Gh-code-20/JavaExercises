// Ghadir 

public class TestFitnessTracker1
{
    public static void main(String[] args) {
        FitnessTracker1 exercise = new FitnessTracker1();
        System.out.println(exercise.getClient() + " " + exercise.getActivaty() + 
        " for "+ exercise.getMinutes1() + 
        " minutes in the morning and " + exercise.getMinutes2() + " minutes in the afternoon");
        System.out.println( "The Avrage of running is  " + exercise.getAvrage());

        // ex 3b pg225
       FitnessTracker1 exercise2 = new FitnessTracker1("Walking", "John Smith", 30, 15);

        System.out.println(exercise2.getClient() + " " + exercise2.getActivaty() + 
        " for "+ exercise2.getMinutes1() + 
        " minutes in the morning and " + exercise2.getMinutes2() + " minutes in the afternoon");
        System.out.println( "The Avrage of walking is  " + exercise2.getAvrage()); 
                   
    }
      

}
    
