import java.util.Scanner;

public class IT26102753Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = input.nextInt();

        int[] values = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        for (int value : values) {
            int count = amount / value;
            amount = amount % value;

            System.out.println(value + " Notes/Coins = " + count);
        }

        input.close();
    }
}