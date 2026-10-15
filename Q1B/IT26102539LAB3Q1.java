import java.util.Scanner;

public class IT26102539LAB3Q1 {
	public static void main(String[] args) {
		double pricePerKg, quantity , totalAmount , totalAmountAfterDiscount;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Price of 1KG of rice: ");
		pricePerKg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		quantity = input.nextDouble();
		
		totalAmount = pricePerKg * quantity;
		// sadasdasd 1b
		
		totalAmountAfterDiscount = totalAmount * 0.90;
		
		System.out.println("(1B)The Total Amount Is : " + totalAmountAfterDiscount);
	}
}