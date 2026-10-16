import java.util.Scanner;
public class IT26102441Lab3Q2{
	public static void main (String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the monthly salary: ");
		double monthly_salary = obj.nextDouble();
		System.out.println("enter the OT hours: ");
		int OT_hours = obj.nextInt();
		System.out.println("enter OT hourly rate: ");
		double OT_hourly_rate = obj.nextDouble();
		double OT_amount = OT_hours * OT_hourly_rate;
		double Totl_salary = monthly_salary + OT_amount;
		System.out.println("your OT amount is " + OT_amount);
		System.out.println("your total salary is " + Totl_salary);
	}
}