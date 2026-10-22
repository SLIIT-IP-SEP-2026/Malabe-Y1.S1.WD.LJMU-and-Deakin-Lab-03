import java.util.Scanner;

public class IT26102468Lab3Q4{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		int digit1 =0;
		int digit2 =0;
		int digit3 =0;
		int digit4 =0;
		int digit5 =0;
		
		System.out.print("Enter a five-digit number: ");
		number = input.nextInt();
		
		digit1 = number/10000;
		number = number%10000;
		
		digit2 = number/1000;
		number = number%1000;
		
		digit3 = number/100;
		number = number%100;
		
		digit4 = number/10;
		number = number%10;
		
		digit5 = number/1;
		number = number%1;
		
		
		System.out.println(digit1 + " " + digit2+ " " + digit3 + " " + digit4 + " " + digit5);
		
	}
	
}