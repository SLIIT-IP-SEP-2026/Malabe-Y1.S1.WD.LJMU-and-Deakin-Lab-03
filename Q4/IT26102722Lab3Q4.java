import java.util.Scanner;

public class IT26102722Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            System.out.print(numStr.charAt(i) + " ");
        }
    }
}
