import java.util.Scanner;

public class IT26102438Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double total = price * kilograms;
        double discountedTotal = total - (total * 10 / 100);

        System.out.println();
        System.out.println("The total amount with 10% discount is: " + discountedTotal);
    }
}
