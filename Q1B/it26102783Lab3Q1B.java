import java.util.Scanner;
	
	public class it26102783Lab3Q1B{
		public static void main (String[]args){
		
		double price , quantity , total , discount;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice : ");
		price = input.nextDouble();
		
		System.out.print("Enter the quantity : ");
		quantity = input.nextDouble();
		
		total = price * quantity;
		discount = total * 0.9;
		
		System.out.println();
		System.out.println("Total Price with 10% discount is : "+discount);
		
		}
	}
