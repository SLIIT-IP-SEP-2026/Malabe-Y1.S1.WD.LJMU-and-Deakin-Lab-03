import java.util.Scanner;
public class IT26102577Lab3Q1A{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double price = input.nextDouble();
		
		System.out.print("Enter the amount of rice needed (kg): ");
		double amount = input.nextDouble();
		
		double total_amount = price * amount;
		
		System.out.print("The total amount of rice: " + total_amount);
	}
}