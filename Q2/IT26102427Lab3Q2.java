import java.util.Scanner;

public class IT26102427Lab3Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the Number of OT hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter the OT rate: ");
        double otRate = input.nextDouble();

        double otPay = otHours * otRate;
        double totalSalary = salary + otPay;

        System.out.println("The total salary is: " + totalSalary);

        input.close();
    }
}