import java.util.Scanner;
	public class IT26102782Lab3Q1A{
		public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double priceperkg = Scanner.nextDouble();
		
		System.out.print("Enter the numder of kilograms you want to buy:");
		double quantity = Scanner.nextDouble();
		
		double totalAmount = priceperkg * quantity;
		
		System.out.println("The total amount is: " + totalAmount);
		
		Scanner.close();
	}
}