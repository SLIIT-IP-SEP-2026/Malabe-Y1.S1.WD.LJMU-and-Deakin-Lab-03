import java.util.Scanner;

public class IT26102759Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter OT Hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter OT Hourly Rate: ");
        double otRate = input.nextDouble();

        double otAmount = otHours * otRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount = Rs." + otAmount);
        System.out.println("Total Salary = Rs." + totalSalary);

        input.close();
    }
}