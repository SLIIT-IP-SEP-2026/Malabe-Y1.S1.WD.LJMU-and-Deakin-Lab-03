import java.util.Scanner;

public class IT26102576Lab3Q1B{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg or rice: ");
		double price1Kg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double amntRice = input.nextDouble();
		
		double priceTot = price1Kg * amntRice;
		
		double afterDiscount = priceTot - ( 10 * priceTot / 100); 
		
		System.out.println();
		System.out.print("The total amount with 10% discount: " + afterDiscount);
	}
}