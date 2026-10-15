import java.util.Scanner;

public class IT26102539LAB03Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	 
	  System.out.println("Enter a FIVE-DIGIT Number: ");
	   int fivedigitnumber = input.nextInt();
	   
	   int count10000 = fivedigitnumber / 10000;
	   fivedigitnumber = fivedigitnumber % 10000;
	   
	   int count1000 = fivedigitnumber / 1000;
	   fivedigitnumber = fivedigitnumber % 1000;
	   int count100 = fivedigitnumber / 100;
	   fivedigitnumber = fivedigitnumber % 100;
	   
	   int count10 = fivedigitnumber / 10;
	   fivedigitnumber = fivedigitnumber % 10;
	   
	   int count1 = fivedigitnumber / 1;
	   fivedigitnumber = fivedigitnumber % 1;
	   
	   System.out.println(count10000 + " " + count1000 + " " + count100 + " "  + count10 + " "  + count1);
	}
}