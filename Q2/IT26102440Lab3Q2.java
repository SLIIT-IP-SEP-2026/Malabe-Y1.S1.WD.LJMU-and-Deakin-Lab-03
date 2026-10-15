import java.util.Scanner;
public class IT26102440Lab3Q2{
	public static void main(String[] args){
		
		double monthlySalary;
		double otHourlyRate;
		double otAmount;
		double otHours;
		double totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Monthly Salaray: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the Number of Hours: ");
		otHours = input.nextDouble();
		
		System.out.print("Enter the OT Hourly Rate: ");
		otHourlyRate = input.nextDouble();
		
		otAmount = otHours * otHourlyRate;
		totalSalary = monthlySalary + otAmount;
		
		System.out.println("The total salary including OT is: " + totalSalary);
	
	}
}

		