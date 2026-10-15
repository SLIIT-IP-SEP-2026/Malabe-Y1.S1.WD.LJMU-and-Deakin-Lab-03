import java.util.Scanner;

public class IT26102576Lab3Q2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		double monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		double hoursOT = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		double rateOT = input.nextDouble();
		
		double amntOT = hoursOT * rateOT;
		
		double totalSalary = monthlySalary + amntOT;
		
		System.out.println();
		System.out.print("The total salary including OT is: " + totalSalary);
	}
}
		
		
		
		
		
		
		