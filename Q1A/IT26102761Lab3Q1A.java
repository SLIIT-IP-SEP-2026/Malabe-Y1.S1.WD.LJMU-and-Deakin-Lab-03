import java.util.Scanner;

public class IT26102761Lab3Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price;
        double kilograms;
        double totalAmount;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilograms = input.nextDouble();

        totalAmount = price * kilograms;

        System.out.println("\nThe total amount is: " + totalAmount);
    }
}