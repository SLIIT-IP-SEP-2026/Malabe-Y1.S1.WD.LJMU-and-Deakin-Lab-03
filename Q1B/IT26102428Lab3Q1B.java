import java.util.Scanner;
public class IT26102428Lab3Q1B {
	public static void main(String[] args){
		
		double pricePerKG, quantity, totalPrice;
        Scanner input = new Scanner(System.in);
		
	   // Input the price of 1 kg of rice
       System.out.print("Please enter the price of 1 KG of rice");
       pricePerKG = input.nextDouble();
		
	   // Asking the user for the no.of KGs
	   System.out.print("Please enter the quantity ");
	   quantity = input.nextDouble();
	   
	   // Calculating the total price
	   totalPrice = pricePerKG * quantity;
	   
	   // Calculating 10% discount
	   double discount = totalPrice * 10/100;
	   
	   // Finalised total price
	   double finalTotal = totalPrice - discount;
   
       // Displaying the total price for the user   
       System.out.print("The Total Price with 10% Discount Is: "+ finalTotal);
	}
}	