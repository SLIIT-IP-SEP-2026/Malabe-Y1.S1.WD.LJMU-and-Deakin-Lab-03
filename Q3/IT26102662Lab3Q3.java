import java.util.Scanner;

public class IT26102662Lab3Q3{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Amount: ");
		int rupeeAmount = input.nextInt();
		
		int count5000 = rupeeAmount / 5000;
		rupeeAmount = rupeeAmount % 5000;
		
		int count1000 = rupeeAmount / 1000;
		rupeeAmount = rupeeAmount % 1000;
		
		int count500 = rupeeAmount / 500;
		rupeeAmount = rupeeAmount % 500;
		
		int count200 = rupeeAmount / 200;
		rupeeAmount = rupeeAmount % 200;
		
		int count100 = rupeeAmount / 100;
		rupeeAmount = rupeeAmount % 100;
		
		int count50 = rupeeAmount / 50;
		rupeeAmount = rupeeAmount % 50;
		
		int count20 = rupeeAmount / 20;
		rupeeAmount = rupeeAmount % 20;
		
		int count10 = rupeeAmount / 10;
		rupeeAmount = rupeeAmount % 10;
		
		int count05 = rupeeAmount / 05;
		rupeeAmount = rupeeAmount % 05;
		
		int count02 = rupeeAmount / 02;
		rupeeAmount = rupeeAmount % 02;
		
		int count01 = rupeeAmount / 01;
		rupeeAmount = rupeeAmount % 01;
		
		System.out.println("5000 Notes - " + count5000);
		System.out.println("1000 Notes - " + count1000);
		System.out.println("500 Notes - " + count500);
		System.out.println("200 Notes - " + count200);
		System.out.println("100 Notes - " + count100);
		System.out.println("50 Notes - " + count50);
		System.out.println("20 Notes - " + count20);
		System.out.println("10 Coins - " + count10);
		System.out.println("05 Coins - " + count05);
		System.out.println("02 Coins - " + count02);
		System.out.println("01 Coins - " + count01);
		
		
		
		
		
		
	}
}