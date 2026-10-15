import java.util.Scanner;

public class IT26102381Lab3Q3 {

    public static void main(String[] args) {

        int[] notes = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rupee amount: ");

        int amount = sc.nextInt();

        for (int i=0; i < notes.length; ++i) {
            int count = amount / notes[i]; // takes the count of each note

            System.out.println(notes[i] + " Notes - " + count);

            amount = amount % notes[i]; // assign the reminder as the new amount
        }
    }
}