import java.util.Scanner;

public class IT26102576Lab3Q3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Rupee amount: ");
		int amntRupee = input.nextInt();
		
		int count5000 = amntRupee / 5000;
		amntRupee = amntRupee % 5000;
		
		int count1000 = amntRupee / 1000;
		amntRupee = amntRupee % 1000;
		
		int count500 = amntRupee / 500;
		amntRupee = amntRupee % 500;
		
		int count200 = amntRupee / 200;
		amntRupee = amntRupee % 200;
		
		int count100 = amntRupee / 100;
		amntRupee = amntRupee % 100;
		
		int count50 = amntRupee / 50;
		amntRupee = amntRupee % 50;
		
		int count20 = amntRupee / 20;
		amntRupee = amntRupee % 20;
		
		int count10 = amntRupee / 10;
		amntRupee = amntRupee % 10;
		
		int count5 = amntRupee / 5;
		amntRupee = amntRupee % 5;
		
		int count2 = amntRupee / 2;
		amntRupee = amntRupee % 2;
		
		int count1 = amntRupee / 1;
		amntRupee = amntRupee % 1;
		
		System.out.println("5000 Notes: " + count5000);
		System.out.println("1000 Notes: " + count1000);
		System.out.println("500 Notes: " + count500);
		System.out.println("200 Notes: " + count200);
		System.out.println("100 Notes: " + count100);
		System.out.println("50 Notes: " + count50);
		System.out.println("20 Notes: " + count20);
		System.out.println("10 Notes: " + count10);
		System.out.println("5 Notes: " + count5);
		System.out.println("2 Notes: " + count2);
		System.out.println("1 Notes: " + count1);
		
	}
}
		
		
		
		