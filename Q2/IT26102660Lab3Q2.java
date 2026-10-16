import java.util.Scanner;
public class IT26102660Lab3Q2 {
    public static void main(String[] args) {
        double OT_Hrs, OT_Rate,OT_Amt,Tot_Salary,Monthly_Salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        Monthly_Salary = input.nextDouble();
        System.out.print("Enter the number of OT hours: ");
        OT_Hrs = input.nextDouble();
        System.out.print("Enter the OT hourly rate: ");
        OT_Rate = input.nextDouble();
        OT_Amt = OT_Hrs * OT_Rate;
        Tot_Salary = Monthly_Salary + OT_Amt;
        System.out.println("The total salary including OT is: " + Tot_Salary);
    }
}
