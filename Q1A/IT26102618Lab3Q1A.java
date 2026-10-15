import java.util.Scanner;

public class IT26102618Lab3Q1A{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price 1kg of rice: ");
		int price = input.nextInt();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		int numberOfKilo = input.nextInt();
		
		float totalAmount = price * numberOfKilo;
		
		System.out.println();
		System.out.print("The total amount is: " + totalAmount);
	}
}