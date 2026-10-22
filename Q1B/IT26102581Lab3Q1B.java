import java.util.Scanner;

public class IT26102581Lab3Q1B {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		
		double perKiloGramRice;
		double numOfKiloGram;
		double sumOfRice;
		double discountAllowed;
		double finalAmount;
		
		System.out.print("Enter the price of 1kg of rice: ");
		perKiloGramRice = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		numOfKiloGram = input.nextDouble();
		
		sumOfRice = perKiloGramRice * numOfKiloGram;
		discountAllowed = sumOfRice * (10.0/100);
		
		finalAmount = sumOfRice - discountAllowed;
		
		System.out.println("The total amount with 10% discount is: " + finalAmount);
	}
}