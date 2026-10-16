import java.util.Scanner;
public class IT26102441Lab3Q4{
	public static void main( String[] args ){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		
		int digit = obj.nextInt();
		
		int digit10000 = digit/10000;
		digit = digit%10000;
		int digit1000 = digit/1000;
		digit = digit%1000;
		int digit100 = digit/100;
		digit = digit%100;
		int digit10 = digit/10;
		digit = digit%10;
		int digit1 = digit/1;
		digit = digit%1;
		
		System.out.print(" "+digit10000);
		System.out.print(" "+digit1000);
		System.out.print(" "+digit100);
		System.out.print(" "+digit10);
		System.out.print(" "+digit1);
		
		
	}
}