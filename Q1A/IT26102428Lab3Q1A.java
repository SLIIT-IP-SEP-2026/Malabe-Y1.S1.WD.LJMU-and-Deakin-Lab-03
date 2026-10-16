import java.util.Scanner;
public class IT26102428Lab3Q1A {
	public static void main(String[] args){
		
		double pricePerKG, quantity, totalPrice;
        Scanner input = new Scanner(System.in);
		
	   // INPUT THE PRICE OF 1 KG OF RICE
       System.out.print("Please enter the price of 1 KG of rice");
       pricePerKG = input.nextDouble();
		
	   // ASKING THE USER FOR THE NO.OF KGs
	   System.out.print("Please enter the quantity ");
	   quantity = input.nextDouble();
	   
	   // CALCULATING THE TOTAL PRICE
	   totalPrice = pricePerKG * quantity;
   
       // DISPLAYING THE TOTAL PRICE FOR THE USER   
       System.out.print("The Total Price Is "+ totalPrice);
	}
}	