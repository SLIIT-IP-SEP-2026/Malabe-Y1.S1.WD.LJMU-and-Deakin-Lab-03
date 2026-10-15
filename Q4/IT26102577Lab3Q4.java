import java.util.Scanner;
public class IT26102577Lab3Q4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int amount_1 = 0;
		int amount_2 = 0;
		int amount_3 = 0;
		int amount_4 = 0;
		int amount_5 = 0;
		
		System.out.print("Enter 5 digit number: ");
		int number = input.nextInt();
		
		amount_1 = number / 10000;
		number = number%10000;
		
		amount_2 = number / 1000;
		number = number%1000;
		
		amount_3 = number / 100;
		number = number%100;
		
		amount_4 = number / 10;
		number = number%10;
		
		amount_5 = number / 1;
		number = number%1;
		
		System.out.print(amount_1 + " " + amount_2 + " " + amount_3 + " " + amount_4 + " " + amount_5 + " ");
	}
}