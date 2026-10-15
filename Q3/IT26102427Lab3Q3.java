import java.util.Scanner; 

public class : IT261024274567Lab3Q3.java {
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the Amount");
        int amount = input.nextInt(); 

        int n5000 = amount / 5000; 
        amount = amount % 5000; 

        int n1000 = amount / 1000; 
        amount = amount % 1000; 

        int n500 = amount /500; 
        amount = amount % 500; 

        int n100 = amount /100; 
        amount = amount % 100; 

        int n50 = amount /50; 
        amount = amount % 50; 

        int n20 = amount /20;
        amount = amount % 20; 

        int n10 = amount /10; 
        amount = amount % 10; 

        int n5 = amount / 5; 
        amount = amount % 5; 

        int n2 = amount / 2; 
        amount = amount % 2; 

        int n1 = amount / 1; 
        amount = amount % 1; 

        System.out.println("/n 5000 notes: " + n5000); 
        System.out.println("1000 notes: " + n1000);
        System.out.println("500 notes: " + n500);
        System.out.println("100 notes: " + n100);
        System.out.println("50 notes: " + n50);
        System.out.println("20 notes: " + n20);
        System.out.println("10 notes: " + n10);
        System.out.println("5 notes: " + n5);
        System.out.println("2 notes: " + n2);
        System.out.println("1 notes: " + n1);

    }
}