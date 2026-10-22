import java.util.Scanner;

public class IT26102468Lab3Q1B{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price 1kg of rice: ");
		int price = input.nextInt();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		int numberOfKilo = input.nextInt();
		
		float totalAmount = price * numberOfKilo;
		float withDiscountAmount = totalAmount-(totalAmount * 10/100);
		
		System.out.println();
		System.out.print("The total amount with 10% discount is: " + withDiscountAmount);
	}
}