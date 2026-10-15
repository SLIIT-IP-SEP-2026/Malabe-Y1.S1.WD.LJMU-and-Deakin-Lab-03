import java.util.Scanner;

public class IT26102618Lab3Q2{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		int monthlySalary = input.nextInt();
		
		System.out.print("Enter the number of OT hours: ");
		int amountOtHours = input.nextInt();
		
		System.out.print("Enter the OT hourly rate: ");
		int rateOt = input.nextInt();
		
		float otAmount = amountOtHours * rateOt;
		float totalSalary = monthlySalary + otAmount;
		
		System.out.println();
		System.out.print("The total salary including OT is: " + totalSalary);
	}
}