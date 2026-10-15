import java.util.Scanner;
public class IT26102439Lab3Q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double price;
		int kilograms;
		double total;
		
		System.out.print("Enter the price of 1Kg of rice: ");
		price=input.nextDouble();
		
		System.out.print("Enter the number ok Kg you want: ");
		kilograms=input.nextInt();
		
		total=price*kilograms;
		
		System.out.println();
		System.out.println("The total amount is: " + total);
		
		input.close();
	}
}