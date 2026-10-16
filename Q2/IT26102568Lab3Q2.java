import java.util.Scanner;

public class IT26102568Lab3Q2 {
    public static void main(String[] args) {
        double monthlySalary, otRate, otAmount, totalSalary;
        int otHours;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        otHours = input.nextInt();

        System.out.print("Enter the OT hourly rate: ");
        otRate = input.nextDouble();

        otAmount = otHours * otRate;
        totalSalary = monthlySalary + otAmount;

        System.out.println("\nThe total salary including OT is: " + totalSalary);

    }
}