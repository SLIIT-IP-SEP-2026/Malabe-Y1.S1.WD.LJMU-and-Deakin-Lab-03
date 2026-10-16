import java.util.Scanner;
public class IT26102441Lab3Q1A{
	public static void main (String[] args){
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the amoun of kg: ");
	    int amount_of_kg = obj.nextInt();
		System.out.println("price of 1kg: ");
		double price_of_1kg = obj.nextDouble();
		double Total_amount = price_of_1kg * amount_of_kg;
		System.out.println(" total amount is  " +Total_amount);
	}
}