import java.util.Scanner;

public class IT26102759Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = input.nextInt();

        int note5000 = amount / 5000;
        amount %= 5000;

        int note1000 = amount / 1000;
        amount %= 1000;

        int note500 = amount / 500;
        amount %= 500;

        int note200 = amount / 200;
        amount %= 200;

        int note100 = amount / 100;
        amount %= 100;

        int note50 = amount / 50;
        amount %= 50;

        int note20 = amount / 20;
        amount %= 20;

        int note10 = amount / 10;
        amount %= 10;

        int note5 = amount / 5;
        amount %= 5;

        int note2 = amount / 2;
        amount %= 2;

        int note1 = amount;

        System.out.println("5000 Notes = " + note5000);
        System.out.println("1000 Notes = " + note1000);
        System.out.println("500 Notes = " + note500);
        System.out.println("200 Notes = " + note200);
        System.out.println("100 Notes = " + note100);
        System.out.println("50 Notes = " + note50);
        System.out.println("20 Notes = " + note20);
        System.out.println("10 Notes = " + note10);
        System.out.println("5 Notes = " + note5);
        System.out.println("2 Coins = " + note2);
        System.out.println("1 Coins = " + note1);

        input.close();
    }
}