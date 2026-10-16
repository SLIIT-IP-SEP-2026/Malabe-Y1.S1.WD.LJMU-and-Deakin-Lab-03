import java.util.Scanner;
public class IT26102660Lab3Q1A{
	public static void main(String[]args){
		double PriceKg, Quantity, TotAmt;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of 1g of rice: ");
		PriceKg = input.nextDouble();
		System.out.print("Enter the number of kilogrms you want to buy: ");
		Quantity = input.nextDouble();
		TotAmt = PriceKg * Quantity;
		System.out.println();
		System.out.println("The total amount is: " + TotAmt);
	}
}
