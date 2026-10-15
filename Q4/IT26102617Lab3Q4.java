import java.util.Scanner;
public class IT26102617Lab3Q4
{

	public static void main(String[] args) 
	{ 
		Scanner value = new Scanner(System.in);
		
		
		
		System.out.print("Enter a five-digit number: ");
		int number = value.nextInt();
		
		int amount_1 = number/10000;
		number=number%10000;
		
		int amount_2=number/1000;
		number=number%1000;
		
		int amount_3=number/100;
		number=number%100;
		
		int amount_4=number/10;
		number=number%10;
		
		int amount_5=number/1;
		number=number%1;
		
		System.out.print(amount_1 + " " + amount_2 + " " + amount_3 + " " + amount_4 + " " + amount_5 + " ");
		
	}
}