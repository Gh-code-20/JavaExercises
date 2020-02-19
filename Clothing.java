//Ghadir ALfadhl

public class Clothing {
  String name_of_product;
  double price_of_product;
  int quantity_of_product;
  double sales_tax;
  double total;

  public Clothing()
  {
    name_of_product = "shirts";
    price_of_product = 15.00;
    quantity_of_product = 5;
    sales_tax = .06;
    total = price_of_product + sales_tax;
  }
  public String getName_Of_Product()
  {
      return name_of_product;
  }
 public double getPrice_Of_Product()
  {
      return price_of_product;
  }

 public int getQuantity_Of_Product()
  {
      return quantity_of_product;
  }
 public double getSales_Tax()
  {
      return sales_tax;
  }
 
public double getTotal()
{
  return total;
}

}
