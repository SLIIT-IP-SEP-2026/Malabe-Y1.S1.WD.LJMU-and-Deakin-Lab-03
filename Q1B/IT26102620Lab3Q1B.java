import java.util.Scanner;

public class IT26102620Lab3Q1B {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price for 1kg of rice: ");
		double price = input.nextDouble();
		
		System.out.print("Enter amount of kilograms to buy: ");
		double kilograms = input.nextDouble();
		
		double total = price * kilograms;
		double discount = total * 10 / 100;
		double finalAmount = total - discount;
		
		
		System.out.println();
		System.out.println("The total amount after adding the 10% discount is: " + finalAmount);
	}
}
	