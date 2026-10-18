


public class IT26102751Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();

        int[] denominations = {
            5000, 1000, 500, 200, 100, 50,
            20, 10, 5, 2, 1
        };

        String[] types = {
            "Notes", "Notes", "Notes", "Notes", "Notes",
            "Notes", "Notes", "Notes", "Coins", "Coins", "Coins"
        };

        for (int i = 0; i < denominations.length; i++) {
            int count = amount / denominations[i];
            amount = amount % denominations[i];

            System.out.printf("%02d %s - %d%n",
                denominations[i], types[i], count);
        }

        input.close();
    }
}
