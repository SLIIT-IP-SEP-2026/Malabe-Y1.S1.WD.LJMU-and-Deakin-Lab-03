import java.util.Scanner;

public class IT26102381Lab3Q1B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price, amount, total;

        System.out.print("Enter the price of 1kg of rice: ");
        price = sc.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        amount = sc.nextDouble();

        total = price * amount;
        System.out.print("The total amount with 10% discount is: " + (total - (total/10)));
    }
}