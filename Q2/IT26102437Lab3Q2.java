import java.util.Scanner;
public class IT26102437Lab3Q2{
	public static void main (String[]args){
		//declare variables
		double monthly_Salary, Num_of_OT_hrs, OT_hourly_rate,OtAmount, totalSalary;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly salary: ");
		monthly_Salary = input.nextDouble();
		System.out.println("Enter the number of OT hours: ");
		Num_of_OT_hrs = input.nextDouble();
		System.out.println("Enter the OT hourly rate: ");
		OT_hourly_rate = input.nextDouble();
		OtAmount = Num_of_OT_hrs * OT_hourly_rate;
		totalSalary = monthly_Salary + OtAmount;
		System.out.println("The OT amount is: " + OtAmount); 
		System.out.println("The total salary is: " + totalSalary);
	} 

} 
		
		
		