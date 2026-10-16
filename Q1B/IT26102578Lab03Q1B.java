import.java.util.Scanner;
public class IT26102578Lab03Q1A {
	public static void (String[]args){
		Scanner input = new Scanner(System.in);
		double pricekg , KgRice, totAmount;
		double discountPrice = 0.1;
		System.out.print("Enter the amount for a kg of Rice: ");
		priceKg = input.nextDouble();
		System.out.print("Enter the kilograms of rice needed: ");
		KgRice = input.nextDouble();
		double totBill = (priceKg*kgRice);
		totAmount = totBill*(1-discountPrice);
		
		System.out.println("The total amount with 10% discount is : " + totAmount);
		
		
		input.close();
	}
}