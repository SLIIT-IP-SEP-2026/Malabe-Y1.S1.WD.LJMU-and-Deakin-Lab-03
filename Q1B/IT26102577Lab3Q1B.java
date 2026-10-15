import java.util.Scanner;
public class IT26102577Lab3Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double price = input.nextDouble();
		
		System.out.print("Enter the amount of rice needed (kg): ");
		double amount = input.nextDouble();
		
		double total_amount = (price * amount);
		double discounted_amount = total_amount - (total_amount)*10/100;
		
		System.out.print("The total amount of rice: " + discounted_amount);
	}
}