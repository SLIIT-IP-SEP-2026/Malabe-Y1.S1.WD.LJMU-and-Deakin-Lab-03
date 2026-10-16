import java.util.Scanner;
public class IT26102578Lab03Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int monthlySalary , otHours;
		double otRate;
		System.out.print("Enter the monthly salary of employee : ");
		monthlySalary = input.nextInt();
		System.out.print("Enter the number of OT hours worked : ");
		otHours = input.nextInt();
		System.out.print("Enter the OT hourly rate : ");
		otRate = input.nextDouble();
		
		double otAmount = (otHours*otRate);
		double totSalary = (monthlySalary+otAmount);
		
		
		System.out.println("The total salary including OT is : " + totSalary);
		
		input.close();
		
	}
	
}

		
		