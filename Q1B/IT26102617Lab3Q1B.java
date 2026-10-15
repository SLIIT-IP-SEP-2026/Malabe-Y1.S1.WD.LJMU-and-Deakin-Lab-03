import java.util.Scanner;
public class IT26102617Lab3Q1B
{

	public static void main(String[] args) 
	{ 
		Scanner value = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double price =value.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double kilograms = value.nextDouble();
		
		double total = price*kilograms;
		
		double discount =total*0.10;
		
		double finalTotal= total-discount;
		
		
		System.out.println("Initial total: "+total);
		System.out.println("10% Discount: "+ discount);
		System.out.println("The total ammount to pay is:"+finalTotal);

		
	}
}
		
		