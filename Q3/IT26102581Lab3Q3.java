import java.util.Scanner;

public class IT26102581Lab3Q3 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		int amount;
		int notes5000, notes1000, notes500, notes200, notes100, notes50, notes20;
		int coins10, coins05, coins02, coins01;
		
		System.out.print("Enter the rupee amount: ");
		amount = input.nextInt();
		
		notes5000 = amount / 5000;
		amount = amount % 5000;
		
		notes1000 = amount / 1000;
		amount = amount % 1000;
		
		notes500 = amount / 500;
		amount = amount % 500;
		
		notes200 = amount / 200;
		amount = amount % 200;
		
		notes100 = amount / 100;
		amount = amount % 100;
		
		notes50 = amount / 50;
		amount = amount % 50;
		
		notes20 = amount / 20;
		amount = amount % 20;
		
		coins10 = amount / 10;
		amount = amount % 10;
		
		coins05 = amount / 5;
		amount = amount % 5;
		
		coins02 = amount / 2;
		amount = amount % 2;
		
		coins01 = amount / 1;
		amount = amount % 1;
		
		System.out.println("\n5000 Notes - " + notes5000);
		System.out.println("1000 Notes - " + notes1000);
		System.out.println("500 Notes - " + notes500);
		System.out.println("200 Notes - " + notes200);
		System.out.println("100 Notes - " + notes100);
		System.out.println("50 Notes - " + notes50);
		System.out.println("20 Notes - " + notes20);
		System.out.println("10 Coins - " + coins10);
		System.out.println("05 Coins - " + coins05);
		System.out.println("02 Coins - " + coins02);
		System.out.println("01 Coins - " + coins01);
	}
}