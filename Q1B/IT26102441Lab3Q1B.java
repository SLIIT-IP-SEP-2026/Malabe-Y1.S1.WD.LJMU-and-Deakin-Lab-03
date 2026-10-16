import java.util.Scanner;
public class IT26102441Lab3Q1B{
	public static void main (String[] args){
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the amoun of kg: ");
	    int amount_of_kg = obj.nextInt();
		System.out.println("price of 1kg: ");
		double price_of_1kg = obj.nextDouble();
		double amount = price_of_1kg * amount_of_kg;
		double discount = amount * 10 / 100;
		double Total_amount = amount - discount;
		
		System.out.println(" total amount is  " +Total_amount);
	}
}