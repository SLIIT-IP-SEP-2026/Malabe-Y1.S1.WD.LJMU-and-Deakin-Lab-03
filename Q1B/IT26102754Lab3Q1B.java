import  java.util.Scanner;
public class IT26102754Lab3Q1B
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Price for 1kg :");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter No. of Kg :");
        double number = input.nextDouble();

        double amount = pricePerKg*number;

        double discount = (0.1*amount);

        double total = amount - discount;

        System.out.println("Amount needed to be paid : " + total);

    }
}