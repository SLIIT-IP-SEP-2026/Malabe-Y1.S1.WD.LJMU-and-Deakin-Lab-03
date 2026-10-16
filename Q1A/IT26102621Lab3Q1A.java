import java.util.Scanner;

public class IT26102621Lab3Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price, kilograms, amount;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        kilograms = input.nextDouble();

        amount = price * kilograms;

        System.out.println("Amount to pay: Rs. " + amount);

        input.close();
    }
}