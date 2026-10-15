import java.util.Scanner;
public class IT26102617Lab3Q1A
{

	public static void main(String[] args) 
	{ 
		Scanner value = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double price =value.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double kilograms = value.nextDouble();
		
		double total = price*kilograms;
		
		System.out.println();
		System.out.println("The total ammount is; "+total);
		
	}
}
		
		