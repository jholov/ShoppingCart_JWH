/**
 * This class uses Resizable Array Bag to help add and remove Items into a shopping cart
 * @author Jake Holovka
 *
 * @param <T>
 */

public class ShoppingCart<T> {
	
	ResizableArrayBag<Item> Cart = new ResizableArrayBag<Item>();
	private T[] items;
	/**
	 * Shows you the current size of your Shopping Cart
	 * @return an int of the Cart size
	 */
	public int getCurrentSize()
	{
      return Cart.getCurrentSize();
	} // end getCurrentSize
	 /**
	  * Adds an Item to the Cart
	  * @param Item newEntry
	  * @return boolean
	  */
	public boolean add(Item newEntry)
	{
		Cart.add( newEntry);
      
      return true;
	} // end add
     /**
      * Removes the last item added in the cart  
      * @return Item
      */
    public Item remove()
		{
		
    	Item result = Cart.remove();
    	  
    	  return result;
	      
		} // end remove
      /**
       * Stores the Shopping Cart into an array
       * @return Item[]
       */
	public Item[] toArray() 
		{
		  Item[] result=new Item[25];
		  int size = Cart.getCurrentSize();
		  
		  //Have to convert Cart to a generic due to ArrayBag toArray returning a generic 
		  items =  (T[])Cart.toArray();
		  
		  for(int index=0; index < size; index++ ) 
    	  {
    		result[index]= ((Item)items[index]);
    	  }	//end for loop
		  
		  return result; 
		} // end toArray
		/**
		 * Calculates the total price of the shopping cart       
		 * @return double
		 */
    public double totalPrice() 
     {
    	  int size = Cart.getCurrentSize();
    	  double sum = 0;
    	  
    	   items= (T[]) Cart.toArray();
    	  
    	  for(int index=0; index < size; index++ ) 
    	  {
    		sum = sum + ((Item) items[index]).itemPrice();
    	  }	
    	 
    	  return sum;
      }//end totalPrice
      	/**
      	 * Clears the shopping cart
      	 */
    public void clear() 
      {
    	  
    	  Cart.clear();
    	  
      }//end clear
		/**
		 * Checks the cart to see how many times an item is added
		 * @param anEntry
		 * @return int
		 */
    public int getFrequencyOf(Item anEntry) 
      {
    	  
    	  int counter = Cart.getFrequencyOf(anEntry);
    	  
    		return counter;
    		
      }//end getFrequencyOf
      /**
       * Checks the cart to see if it contains an item
       * @param anEntry
       * @return boolean
       */
    public boolean contains(Item anEntry)
		{
		
    	  boolean result =  Cart.contains(anEntry);
    	  	return result;
    	  
		} // end contains
      /**
       * Checks the cart to see if the cart is empty
       * @return boolean
       */
    public boolean isEmpty()
		{
	     boolean result = Cart.isEmpty();
	      return result;
	      
		} // end isEmpty
      /**
       * Removes a specific entry in the cart
       * @param anEntry
       * @return boolean
       */
    public boolean remove(Item anEntry)
		{
		boolean	result = Cart.remove(anEntry);
		
		  return result;
		  
		}//end remove
    	/**
    	 * Calculates the tax rate of the total cost
    	 * @return double
    	 */
    public double calTax() 
    	{
    	  
    	  double sum = 0;
    	  double tax = 0;
    	  
    	sum = totalPrice(); 
    	tax = sum * .06;
    	
    		return tax;
    	}//end calTax

	
}//end class
