import java.util.Scanner;
public class IT26102428Lab3Q2 {
    public static void main(String[] args){
	  
	  Scanner input = new Scanner(System.in);
	  
	  // Declare all the variables
	  double monthlySalary, hoursOfOT, hourlyRate, ot_amount, totalSalary;
	  
	  // Input the montly Salary
	  System.out.print("Please enter the monthly salary:");
	  monthlySalary = input.nextDouble();
	  
	  // Input no.of OT hours
	  System.out.print("Please enter the number of OT hours:");
	  hoursOfOT = input.nextDouble();
	  
	  // Input the OT hour rate
	  System.out.print("Please enter the OT hourly rate:");
	  hourlyRate = input.nextDouble();
	  
	  // Calculate the OT Amount
	  ot_amount = hoursOfOT * hourlyRate;
	  
	  // Calculating the Total Salary
	  totalSalary = monthlySalary + ot_amount;
	  
	  // Output the total salary
	  System.out.print("The total salary including the OT is "+ totalSalary);
	}
}	
	