import java.util.Scanner;

public class MakeChange_V2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // *User Story #1
        // *The user is prompted asking for the price of the item.
        System.out.println("What is the price of the item? ");
        double itemPriceDouble = getValidDouble(sc);
        int itemPrice = (int) Math.round(itemPriceDouble * 100);

        // *User Story #2
        // *The user is then prompted asking how much money was tendered by the
        // *customer.
        System.out.println("How much did the customer give? ");
        double amtTenderDouble = getValidDouble(sc);
        int amtTender = (int) Math.round(amtTenderDouble * 100);
        sc.close();

        // *User Story #3
        // *Display an appropriate message if the customer provided too little money or
        // *the exact amount.
        double amtRemaining = amtTender - itemPrice;

        if (amtRemaining < 0) {
            System.err.print("The item is: " + String.format("%.2f", itemPrice / 100.0)
                    + " Please pay the remaining amount: "
                    + String.format("%.2f", -amtRemaining / 100.0));
        } else if (amtRemaining == 0) {
            System.out.print("Thank you come again! ");
        } else {
            changeBreakdown(amtRemaining);
        }

    }

    // *Get a valid double value from the user
    private static double getValidDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            sc.next(); // *discard the invalid input
        }
        return sc.nextDouble();
    }

    // *User Story #4
    // *If the amount tendered is more than the cost of the item, display the number
    // *of bills and coins that should be given to the customer.
    private static void changeBreakdown(double change) {
        System.out.println("Your change is: $" + String.format("%.2f", change / 100.0));
        System.out.println("\nChange Breakdown: ");

        int[] values = { 2000, 1000, 500, 100, 25, 10, 5, 1 };
        String[] labels = { "twenty dollar bill(s)", "ten dollar bill(s)", "five dollar bill(s)", "one dollar bill(s)",
                "quarter(s)", "dime(s)", "nickel(s)", "penny(s)" };

        for (int i = 0; i < values.length; i++) {
            int quantity = (int) (change / values[i]);
            change -= quantity * values[i];
            // change = Math.round(change * 100.0) / 100.0; // Avoid rounding errors

            if (quantity > 0) {
                System.out.println(quantity + " " + labels[i]);
            }
        }

        System.out.println("Test");
    }

}
