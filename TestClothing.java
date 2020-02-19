//Ghadir Alfadhl

public class TestClothing
{
    public static void main(String[] args) 
    {
        Clothing  Shop = new Clothing();
        System.out.println("You bought:  " + + Shop.getQuantity_Of_Product() +
         " " + Shop.getName_Of_Product() + "\nCost: $"+ Shop.getPrice_Of_Product() +
         " \nSales Tax: " + Shop.getSales_Tax());
         System.out.println("Your total is: " + Shop.getTotal());

    }
}