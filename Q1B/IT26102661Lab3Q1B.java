import java.util.Scanner;

public class IT26102661Lab3Q1B{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		double pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double noOfKg = input.nextDouble();
		
		double totalAmount = (pricePerKg * noOfKg);
		double discount = totalAmount - (totalAmount * 0.1);
		
		System.out.println("The total amount with 10% discount is: " + discount);
		
		
		
	}
	
}