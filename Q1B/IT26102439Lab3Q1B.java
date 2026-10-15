import java.util.Scanner;
public class IT26102439Lab3Q1B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double price;
		int kilograms;
		double total;
		double discount;
		double amount;
		
		System.out.print("Enter the price of 1Kg of rice: ");
		price=input.nextDouble();
		
		System.out.print("Enter the number ok Kg you want: ");
		kilograms=input.nextInt();
		
		total=price*kilograms;
		
		discount=total*10/100;
		
		amount=total-discount;
		
		System.out.println();
		System.out.println("The total amount with 10% discount is: " + amount);
		
		input.close();
	}
}