import java.util.Scanner;

public class IT26102661Lab3Q1A{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		double pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double noOfKg = input.nextDouble();
		
		double totalAmount = (pricePerKg * noOfKg);
		
		System.out.println("The total amount is: " + totalAmount);
		
		
		
	}
	
}