import java.util.Scanner;

public class IT26102579Lab3Q1A {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in);
		
		double perKiloGramRice;
		double numOfKiloGram;
		double sumOfRice;
		
		System.out.print("Enter the price of 1kg of rice: ");
		perKiloGramRice = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		numOfKiloGram = input.nextDouble();
		
		sumOfRice = perKiloGramRice * numOfKiloGram;
		
		System.out.println("The total amount is: " + sumOfRice);
	}
}