import java.until.Scanner;

public class IT26102616Lab3Q ITxxxxxxxxLab3Q1B.java {
    public static void main(String[] args) {
	
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a five-digit number: ");
    
    int num = scanner.nextInt();

        int d1 = num / 10000;
        int d2 = (num / 1000) % 10;
        int d3 = (num / 100) % 10;
        int d4 = (num / 10) % 10;
        int d5 = num % 10;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
		
    }
}