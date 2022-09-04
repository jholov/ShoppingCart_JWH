/** A class of items for sale.
    @author Jake Holovka
    
    @version 5.0
*/
public class Item
{
   private String description;
   private int price;
   /**
    * Constructor for an Item
    * @param productDescription
    * @param productPrice
    */
	public Item(String productDescription, int productPrice) 
	{
      description = productDescription;
      price = productPrice;
      
	} // end constructor
	/**
	 * Grabs the items price
	 * @return double
	 */
	public double itemPrice() 
	{
      return price;
	} // end getPrice
	/**
	 * Grabs the items description
	 * @return String
	 */
	public String itemDescription() 
	{
      return description;
	} // end getDescription
	/**
	 * 
	 * @return String
	 */
	public String toString() 
	{
      return description + "\t$" + price  ;
	} // end toString
} // end Item