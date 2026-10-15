import java.util.Scanner;
	public class IT26102324Lab3Q1b{ 
		public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice;");
		double priceperkg = Scanner.nextDouble();
		
		System.out.print("Enter the number of Kilograms you want to buy:");
		double quantity = Scanner.nextDouble();
		
		double totalAmount = priceperkg * quantity;
		
		double discountedAmount = totalAmount - ( totalAmount * 0.10);
		
		System.out.println("The total amount with 10% discount is : " +discountedAmount);
		
		Scanner.close();
		
	}
}