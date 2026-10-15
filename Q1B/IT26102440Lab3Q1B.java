import java.util.Scanner;
public class IT26102440Lab3Q1B{
	public static void main(String[] args){
			
			double pricePerKg;
			double quantity;
			double total;
			double discount;
			double totalAmount;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the price of 1Kg of rice: ");
			pricePerKg = input.nextDouble();
			
			System.out.print("Enter the number of kilograms you want to buy: ");
			quantity = input.nextDouble();
			
			total = pricePerKg * quantity;
			
		
			discount = total * 0.1;
			totalAmount = total - discount;
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("The total amount is: " + total);
			System.out.println("The discount amount is: " + discount);
			System.out.println("The totalAmount is: " + totalAmount);
			
	}
}