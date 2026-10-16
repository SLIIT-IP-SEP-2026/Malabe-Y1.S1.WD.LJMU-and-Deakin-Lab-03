import java.util.Scanner;

public class IT26102568Lab3Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        int digit5Num = input.nextInt();

        int digit1 = digit5Num / 10000;
        digit5Num = digit5Num % 10000;

        int digit2 = digit5Num / 1000;
        digit5Num = digit5Num % 1000;

        int digit3 = digit5Num / 100;
        digit5Num = digit5Num % 100;

        int digit4 = digit5Num / 10;
        digit5Num = digit5Num % 10;

        int digit5 = digit5Num;

        System.out.print(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}