import java.util.Scanner;

public class IT26102661Lab3Q2 {
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		double otAmount;
		
		double totalSalary;
		
		System.out.print("Enter the monthly salary: ");
		double monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		int otHours = input.nextInt();
		
		System.out.print("Enter the OT hourly rate: ");
		int otHourlyRate = input.nextInt();
		
		otAmount = (otHours * otHourlyRate);
		totalSalary = (monthlySalary + otAmount);
		
		System.out.print("The total salary including Ot is: " + totalSalary);
		
		
	}
}