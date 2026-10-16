import java.util.Scanner;

public class IT26102621Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price, kilograms, amount, discount, finalAmount;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        kilograms = input.nextDouble();

        amount = price * kilograms;

        discount = amount * 0.10;

        finalAmount = amount - discount;

        System.out.println("Total amount: Rs. " + amount);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Amount to pay: Rs. " + finalAmount);

        input.close();
    }
}