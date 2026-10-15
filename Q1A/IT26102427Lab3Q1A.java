import java.util.Scanner; 

public class IT26102427Lab3Q1A { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the price of 1KG of rice: "); 
        double priceperKg = input.nextDouble(); 

        System.out.print("Enter the weight of rice in KG: "); 
        double weight = input.nextDouble(); 

        double totalPrice = priceperKg * weight; 

        System.out.println("The total price of rice is : " + totalPrice); 

    }
}