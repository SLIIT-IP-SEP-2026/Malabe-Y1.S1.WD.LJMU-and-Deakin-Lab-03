import java.util.Scanner;

public class IT26102381Lab3Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");

        String number = sc.nextInt() + ""; // casting integer to string

        String _number = "";
        for (int i=0; i < number.length(); ++i) { // loops through the characters
            _number += number.charAt(i) + " ";
        }

        System.out.print(_number);
    }
}