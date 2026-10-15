import java.util.Scanner; 

public class IT26102427Lab3Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the five digit number: ");
        int number = input.nextInt();

        int count10000 = number / 10000; 
        number = number % 10000; 

        int count1000 = number / 1000; 
        number = number % 1000; 

        int count100 = number / 100; 
        number = number % 100; 

        int count10 = number / 10; 
        number = number % 10; 

        int count1 = number / 1; 
        number = number % 1;

        System.out.print(count10000 + " " + count1000 + " " + count100 + " " + count10 + " " + count1);
    }
}