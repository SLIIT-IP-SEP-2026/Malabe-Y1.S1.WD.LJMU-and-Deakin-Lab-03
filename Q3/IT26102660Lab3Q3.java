import java.util.Scanner;
public class IT26102660Lab3Q3{
	public static void main (String[]args){
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the amount of cash: ");
		int Amt = input.nextInt();
		
		int Notes;
		Notes = Amt/5000;
		System.out.println("5000 Notes " + Notes);
		Amt %= 5000;
		
		Notes = Amt/1000;
		System.out.println("1000 Notes" + Notes);
		Amt %= 1000;
		
		Notes = Amt/500;
		System.out.println("500 Notes"+ Notes);
		Amt %= 500;
		
		Notes = Amt/200;
		System.out.println("200 Notes" + Notes);
		Amt %= 200;
		
		Notes = Amt/100;
		System.out.println("100 Notes" + Notes);
		Amt %= 100;
		
		Notes = Amt/50;
		System.out.println("50 Notes" + Notes);
		Amt %= 50;
		
		Notes = Amt/20;
		System.out.println("20 Notes" + Notes);
		Amt %= 20;
		
		Notes = Amt/10;
		System.out.println("10 Notes" + Notes);
		Amt %= 10;
		
		Notes = Amt/5;
		System.out.println("5 Notes" + Notes);
		Amt %= 5;
		
		Notes = Amt/2;
		System.out.println("2 Notes" + Notes);
		Amt %= 2;
		
		Notes = Amt/1;
		System.out.println("1 Notes" + Notes);
		Amt %= 1;
		
		input.close();
	}
}