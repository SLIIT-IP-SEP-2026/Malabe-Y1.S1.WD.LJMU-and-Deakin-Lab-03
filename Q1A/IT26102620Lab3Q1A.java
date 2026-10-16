import java.util.Scanner;

public class IT26102620Lab3Q1A {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price for 1kg of rice: ");
		double price = input.nextDouble();
		
		System.out.print("Enter amount of kilograms to buy: ");
		double kilograms = input.nextDouble();
		
		double total = price * kilograms;
		
		System.out.println();
		System.out.println("The total amount is: " + total);
		
	}
}
	