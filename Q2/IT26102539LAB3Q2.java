import java.util.Scanner;

public class IT26102539LAB3Q2 {
	public static void main(String[] args) {
		double monthSalary, otHours, otHourRate, otAmount, totalsalary;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Monthly Salary: ");
		monthSalary = input.nextDouble();
		
		System.out.print("Enter the number Of OT Hours: ");
		otHours = input.nextDouble();
		
		System.out.print("Enter the number Of OT Hourly Rate: ");
		otHourRate = input.nextDouble();
		
		otAmount = otHours * otHourRate;
		totalsalary = monthSalary + otAmount;
		
		System.out.println("The Total Salary Including OT IS: " + totalsalary);
	}
}