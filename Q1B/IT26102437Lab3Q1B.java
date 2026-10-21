import java.util.Scanner;
public class IT26102437Lab3Q1B{
	public static void main (String[]args){
		//declare the variables
		double pricePerkg, numOfkg, amountPaid, discountedAmount,discountedPrice ;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1 kg of rice: " );
		pricePerkg = input.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy: ");
		numOfkg = input.nextDouble(); 
		// amount to be paid = pricePerkg * numOfkg 
		amountPaid = pricePerkg * numOfkg;
		// discountedAmount = amountpaid /10
		// discountedPrice = amountPaid - discountedPrice
		discountedAmount = amountPaid/ 10.0;
		discountedPrice = amountPaid - discountedAmount;
		System.out.print("The total amount is: " + amountPaid);
		System.out.print("The total amount with 10% discount is: " + discountedPrice);
	} 
	
} 