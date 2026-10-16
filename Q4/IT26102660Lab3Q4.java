import java.util.Scanner;
public class IT26102660Lab3Q4 {
    public static void main(String[] args) {
        int Num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        Num = input.nextInt();
        int d1 = Num / 10000;
        int d2 = (Num / 1000) % 10;
        int d3 = (Num / 100) % 10;
        int d4 = (Num / 10) % 10;
        int d5 = Num % 10;
        System.out.println("  " + d1 + "  " + d2 + "  " + d3 + "  " + d4 + "  " + d5);
    }
}