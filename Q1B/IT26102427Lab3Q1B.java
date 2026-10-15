import java.util.Scanner; 

public class IT26102427Lab3Q1B { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the price of 1KG of rice: "); 
        double priceperKg = input.nextDouble(); 

        System.out.print("Enter the weight of rice in KG: "); 
        double weight = input.nextDouble(); 

        double totalPrice = priceperKg * weight; 
        double discount = totalPrice * 10/100;
        double finalPrice = totalPrice - discount; 

        System.out.println("The total price of rice is : " + totalPrice); 
        System.out.println("The discount on rice is : " + discount); 
        System.out.println("The final price of rice after discount is: " + finalPrice); 
    }
}
