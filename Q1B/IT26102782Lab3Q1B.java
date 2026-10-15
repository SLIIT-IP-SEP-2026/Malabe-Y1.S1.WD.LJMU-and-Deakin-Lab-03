import java.util.Scanner;
	public class IT26102782Lab3Q1B{
		public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double pricePerKg = Scanner.nextDouble();
		
		System.out.print("Enter the numder of kilograms you want to buy:");
		double quantity = Scanner.nextDouble();
		
		double totalAmount = pricePerKg * quantity;
		
		double discountedAmount = totalAmount -(totalAmount * 0.10);
		
		System.out.println("The total amount with 10% discount is: " + discountedAmount);
		
		Scanner.close();
	}
}