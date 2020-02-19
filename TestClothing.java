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

/*Create a Shopping class that includes data fields for the name of a clothing product, the cost of the product,  
the quantity of the product (how many of each), and the sales tax.  
The class includes methods to get each field.
Create a default constructor that automatically sets the name of the clothing to shirts, 
the cost to 15.00, the quantity to 5, and the sales tax to .06. Save the file as Clothing.java. 
Create an application that demonstrates each method works correctly 
and calculate the total cost of what the customer will owe and display it, 
along with displaying all of the data from each of the variables. Upload the .java file to this assignment. */ 
