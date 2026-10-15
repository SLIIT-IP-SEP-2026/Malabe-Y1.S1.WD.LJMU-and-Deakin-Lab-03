import java.util.Scanner;
public class IT26102439Lab3Q2{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		
		double salary;
		int otHours;
		double otRate;
		double otAmount;
		double totalSalary;
		
		System.out.print("Enter the monthly salary : ");
		salary=input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		otHours=input.nextInt();
		
		System.out.print("Enter the OT hourly rate: ");
		otRate=input.nextDouble();
		
		otAmount=otHours*otRate;
		
		totalSalary=salary+otAmount;
		
		System.out.println();
		System.out.println("The total salary including OT is: " + totalSalary);
		
		input.close();
	}
}