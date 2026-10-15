import java.util.Scanner;
public class IT26102440Lab3Q1A{
	public static void main(String[] args){
			
			double pricePerKg;
			double quantity;
			double total;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the price of 1Kg of rice: ");
			pricePerKg = input.nextDouble();
			
			System.out.print("Enter the number of kilograms you want to buy: ");
			quantity = input.nextDouble();
			
			total = pricePerKg * quantity;
			
			System.out.println();
			System.out.println("The total amount is: " + total);
			
	}
}