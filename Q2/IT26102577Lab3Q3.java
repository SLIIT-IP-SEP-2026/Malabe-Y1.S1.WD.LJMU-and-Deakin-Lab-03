import java.util.Scanner;
public class IT26102577Lab3Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int note_5000 = 0;
		int note_1000 = 0;
		int note_500 = 0;
		int note_100 = 0;
		int note_50 = 0;
		int note_20 = 0;
		int coin_10 = 0;
		int coin_2 = 0;
		int coin_1 = 0;
		
		System.out.println("Enter the rupee Amount: ");
		int amount = input.nextInt();
		
		note_5000 = amount/5000;
		amount = amount%5000;
		
		note_1000 = amount/1000;
		amount = amount%1000;
		
		note_500 = amount/500;
		amount = amount%500;
		
		note_100 = amount/100;
		amount = amount%100;
		
		note_50 = amount/50;
		amount = amount%50;
		
		coin_10 = amount/10;
		amount = amount%10;
		
		coin_2 = amount/2;
		amount = amount/2;
		
		coin_1 = amount/1;
		amount = amount/1;
		
		System.out.println("number of notes/coins in each amount:");
		System.out.println("5000 notes: " + note_5000);
		System.out.println("1000 notes: " + note_1000);
		System.out.println("500 notes: " + note_500);
		System.out.println("100 notes: " + note_100);
		System.out.println("50 notes: " + note_50);
		System.out.println("20 notes: " + note_20);
		System.out.println("10 coins: " + coin_10);
		System.out.println("2 coins : " + coin_2);
		System.out.println("1 coins: " + coin_1);
	}
}

		