import java.util.Scanner;

public class IT26102759Lab3Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kilograms = input.nextDouble();

        double amount = pricePerKg * kilograms;

        System.out.println("Amount to pay = Rs." + amount);

        input.close();
    }
}