import java.util.Scanner;
	public class IT26102617Lab3Q3 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter ammount:");
			int ammount = input.nextInt();
			
			int notes5000 = ammount/5000;
			ammount = ammount%5000;
			
			int notes1000 = ammount/1000;
			ammount = ammount%1000;
			
			int notes500 = ammount/500;
			ammount = ammount%500;
			
			int notes200 = ammount/200;
			ammount = ammount%200;
			
			int notes100 = ammount/100;
			ammount = ammount%100;
			
			int notes50 = ammount/50;
			ammount = ammount%50;
			
			int notes20 = ammount/20;
			ammount = ammount%20;
			
			int notes10 = ammount/10;
			ammount = ammount%10;
			
			int notes05 = ammount/05;
			ammount = ammount%05;
			
			int notes02=ammount/02;
			ammount = ammount%02;
			
			int notes01=ammount/01;
			ammount = ammount%01;
			
			System.out.println("5000 Notes - " + notes5000);
			System.out.println("1000 Notes - " + notes1000);
			System.out.println("500 Notes - " + notes500);
			System.out.println("100 Notes - " + notes100);
			System.out.println("50 Notes - " + notes50);
			System.out.println("10 Notes - " + notes10);
			System.out.println("05 Notes - " + notes05);
			System.out.println("02 Notes - " + notes02);
			System.out.println("01 Notes - " + notes01);
			
		}
	}
			
			
			
			
			
			
			
			