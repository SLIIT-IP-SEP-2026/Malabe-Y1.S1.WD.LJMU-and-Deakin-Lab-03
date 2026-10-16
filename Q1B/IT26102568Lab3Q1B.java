import java.util.Scanner;

public class IT26102568Lab3Q1B {
	
	public static void main(String[] args){
		double pricePerKg , quantity , totalAmount , discount , amountToPay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1Kg of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		quantity = input.nextDouble();
		
		totalAmount = (pricePerKg*quantity);
		discount = totalAmount * 0.10;
		amountToPay = totalAmount - discount;
		
		
		System.out.println();
		System.out.println("The total amount is:" + amountToPay);
			
		
	}
	
}
