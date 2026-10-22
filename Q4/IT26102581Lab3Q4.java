import java.util.Scanner;

public class IT26102581Lab3Q4 {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		String number;
		
		System.out.print("Enter a five-digit number: ");
		number = input.next();
		
		System.out.println("\n" + number.charAt(0) + " " + number.charAt(1) + " " + number.charAt(2) + " " + number.charAt(3) + " " + number.charAt(4)); 
	}
}