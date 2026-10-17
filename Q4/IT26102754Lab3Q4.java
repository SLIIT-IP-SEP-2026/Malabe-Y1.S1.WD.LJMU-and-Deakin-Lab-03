import java.util.Scanner;
public class IT26102754Lab3Q4
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int amount = input.nextInt();

        int count10000 =  amount/10000;
        amount = amount%10000;
        int count1000 =  amount/1000;
        amount = amount%1000;
        int count100 =  amount/100;
        amount = amount%100;
        int count10 =  amount/10;
        amount = amount%10;
        int count1 =  amount/1;
        amount = amount%1;

        System.out.print(count10000);
        System.out.print(" "+count1000);
        System.out.print(" "+count100);
        System.out.print(" "+count10);
        System.out.print(" "+count1);
        

    }
}