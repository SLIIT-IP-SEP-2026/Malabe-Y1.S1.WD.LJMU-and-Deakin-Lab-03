import java.util.Scanner;

public class IT26102759Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kilograms = input.nextDouble();

        double totalBill = pricePerKg * kilograms;
        double discount = totalBill * 0.10; // 10% discount
        double amountToPay = totalBill - discount;

        System.out.println("Total Bill = Rs." + totalBill);
        System.out.println("Discount = Rs." + discount);
        System.out.println("Amount to pay = Rs." + amountToPay);

        input.close();
    }
}