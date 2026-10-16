import java.util.Scanner;

public class IT26102662Lab3Q4{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a five-digit number: ");
		int numberOfFiveDigit = input.nextInt();
		
		int digit1 = numberOfFiveDigit/10000;
		numberOfFiveDigit  = numberOfFiveDigit%10000;
		
		int digit2 = numberOfFiveDigit/1000;
		numberOfFiveDigit = numberOfFiveDigit%1000;
		
		int digit3 = numberOfFiveDigit/100;
		numberOfFiveDigit = numberOfFiveDigit%100;
		
		int digit4 = numberOfFiveDigit/10;
		numberOfFiveDigit = numberOfFiveDigit%10;
		
		int digit5 = numberOfFiveDigit/1;
		numberOfFiveDigit = numberOfFiveDigit%1;
		
		System.out.print(digit1);
        System.out.print(" " + digit2);
		System.out.print(" " + digit3);
		System.out.print(" " + digit4);
		System.out.print(" " + digit5);
		
	}
}