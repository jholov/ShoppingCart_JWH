
public class Application {

	public static void main(String[] args) {
		
		ShoppingCart groceries = new ShoppingCart();
		Item milk = new Item("Galleon of Milk",3);
		Item glue = new Item("Gorilla Glue", 2);
		Item TV = new Item("OLED 4k TV", 900);
		Item PC = new Item("Lenovo Legion 5 pro",1200);
		Item Taco = new Item("Ground Turkey Tacos", 5);
		Item Chicken = new Item("White Meat Chicken", 8);
		
		System.out.println("\n"+"*******************************"+ "\n"
			+ "getCurrentSize method" + "\n" +"*******************************"+"\n");
		
		//testing getCurrentSize when no items are added
		System.out.println(groceries.getCurrentSize());
		
		groceries.add(milk);
		groceries.add(glue);
		
		//testing getCurrentSize when two items are added
		System.out.println(groceries.getCurrentSize());
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "add method" + "\n" +"*******************************"+"\n");
		//Showing groceries does not contain PC
		System.out.println(groceries.contains(PC));	
		System.out.println(groceries.add(PC));
		
		//Showing PC was added
		System.out.println(groceries.contains(PC));
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "remove method" + "\n" +"*******************************"+"\n");
		
		//showing the groceries cart has the PC so it may be removed
		System.out.println(groceries.contains(PC));
		System.out.println(groceries.remove());
		
		//showing the PC was removed from the ShoppingCart
		System.out.println(groceries.contains(PC));
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "toArray Method" + "\n" +"*******************************"+"\n");
		
		//converting the groceries ShoppingCart into an array
		Item[]GroceryArray = groceries.toArray();
		System.out.println(GroceryArray[1].itemDescription());
		System.out.println(GroceryArray[1].itemPrice());
		

		System.out.println("\n"+"*******************************"+ "\n"
				+ "totalPrice Method" + "\n" +"*******************************"+"\n");
		
		//Listing each individual item price
		System.out.println(GroceryArray[0].itemPrice());
		System.out.println(GroceryArray[1].itemPrice());
		
		
		//Listing the total price
		System.out.println(groceries.totalPrice());
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "clear Method" + "\n" +"*******************************"+"\n");
		
		//Showing groceries has items
		System.out.println(groceries.getCurrentSize());
		//Clears the groceries shopping cart
		groceries.clear();
		
		//Showing groceries has no items
		System.out.println(groceries.getCurrentSize());
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "getFrequencyOf Method" + "\n" +"*******************************"+"\n");
		
		//Adding two tacos to groceries
		groceries.add(Taco);
		groceries.add(Taco);
		
		//Showing two tacos is the frequency in the cart
		System.out.println(groceries.getFrequencyOf(Taco));
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "contains Method" + "\n" +"*******************************"+"\n");
		
		//Showing groceries contains Taco
		System.out.println(groceries.contains(Taco));
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "isEmpty Method" + "\n" +"*******************************" + "\n");
		
		//Showing list is not empty as it holds two tacos
		System.out.println(groceries.isEmpty());
		
		//Clearing the cart to show it is empty
		groceries.clear();
		System.out.println(groceries.isEmpty());
		
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "remove(anEntry) Method" + "\n" +"*******************************" + "\n");
		
		//Adding a TV to be removed
		groceries.add(TV);
		System.out.println(groceries.contains(TV));
		
		//Removing the TV and showing it is gone
		groceries.remove(TV);
		System.out.println(groceries.contains(TV));
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "calTax Method" + "\n" +"*******************************" + "\n");
		
		//Adding items to show Tax Cost
		groceries.add(TV);
		groceries.add(PC);
		
		//Showing Total Price
		System.out.println(groceries.totalPrice());
		
		//Calculating the Michigan Sales Tax which is 6%
		System.out.println(groceries.calTax());
		
		System.out.println("\n"+"*******************************"+ "\n"
				+ "adding and removing items" + "\n" +"*******************************" + "\n");
		
		//Adding items to the cart
		System.out.println(groceries.add(Chicken));
		System.out.println(groceries.add(glue));
		System.out.println(groceries.add(milk));
		
		System.out.println("\n\n");
		
		Item[]NewList = groceries.toArray();
		
		//for loop to run through the array
		for(int index=0; index < NewList.length; index++ ) 
  	  {
			if(NewList[index]==null) 
			{
				
			}else
			System.out.println(NewList[index]);
  	  }	//end for loop
		
		//adding more items to the cart
		groceries.add(Chicken);
		groceries.add(Chicken);
		
		System.out.println("\n\n");
		
		Item[]SecondList = groceries.toArray();
		
		//for loop to iterate through the array
		for(int index=0; index < NewList.length; index++ ) 
	  	  {
				if(SecondList[index]==null) 
				{
					
				}else
				System.out.println(SecondList[index]);
	  	  }	//end for loop
		
		System.out.println("\n\n");
		
		//removing items in the cart
		groceries.remove(TV);
		groceries.remove(PC);
		groceries.remove(glue);
		groceries.remove(Chicken);
		groceries.remove(Chicken);
		groceries.remove(Chicken);
		
		//adding more items in the cart
		groceries.add(milk);
		groceries.add(milk);
		
		Item[]ThirdList = groceries.toArray();
		
		//for loop to iterate through the array
		for(int index=0; index < NewList.length; index++ ) 
	  	  {
				if(ThirdList[index]==null) 
				{
					
				}else
				System.out.println(ThirdList[index]);
				
	  	  }	//end for loop
		
	}//end main

}//end class