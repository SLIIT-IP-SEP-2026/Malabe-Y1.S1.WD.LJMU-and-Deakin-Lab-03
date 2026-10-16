import java.util.Scanner;

public class IT26102661Lab3Q4{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number: ");
		int fiveDigitNumber = input.nextInt();
		
		int digit1 = fiveDigitNumber/10000;
		fiveDigitNumber  = fiveDigitNumber%10000;
		
		int digit2 = fiveDigitNumber/1000;
		fiveDigitNumber = fiveDigitNumber%1000;
		
		int digit3 = fiveDigitNumber/100;
		fiveDigitNumber = fiveDigitNumber%100;
		
		int digit4 = fiveDigitNumber/10;
		fiveDigitNumber = fiveDigitNumber%10;
		
		int digit5 = fiveDigitNumber/1;
		fiveDigitNumber = fiveDigitNumber%1;
		
		System.out.print(digit1);
        System.out.print(" " + digit2);
		System.out.print(" " + digit3);
		System.out.print(" " + digit4);
		System.out.print(" " + digit5);
		
	}
}