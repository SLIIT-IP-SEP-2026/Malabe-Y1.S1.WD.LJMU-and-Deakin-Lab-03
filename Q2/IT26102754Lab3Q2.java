import java.util.Scanner;

public class IT26102754Lab3Q2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the monthly salary :");
        double monthlySalary = input.nextDouble();
        
        System.out.print("Enter the number of OT hours:");
        double numberOfOT = input.nextDouble();

        System.out.print("Enter the OT hourly rate :");
        double hourlyRate = input.nextDouble();

        double OT_Amount = numberOfOT * hourlyRate;
        double Total_Salary = monthlySalary+ OT_Amount;

        System.out.println("The total salary including OT is : " + Total_Salary);

    }
    
}
