import java.util.Scanner;

public class IT26102662Lab3Q1B{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		double priceOf1Kg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double numberOfKilograms = input.nextDouble();
		
		double totalAmount = (priceOf1Kg * numberOfKilograms);
		
		
		double discountAmount = totalAmount - (totalAmount * 0.1); 
		System.out.println("The total amount with 10% discount: " + discountAmount);
		
		
		
	}
	
}