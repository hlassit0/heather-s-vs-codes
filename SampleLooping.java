import java.util.Scanner;

public class SampleLooping {
    public static void main(String[] args) {
        int choice = 0;
        int numMonths = 0;
        double totalCost = 0.0;
        double costPerMonth = 0.0;
        int numMemberships = 0;
        boolean firstMembership = true;
        double cheapestMembership = 0;

        final double ADULT_COST = 40.0;
        final double CHILD_COST = 20.0;
        final double SENIOR_COST = 30.0;

        final int ADULT_CHOICE = 1;
        final int CHILD_CHOICE = 2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many health club memberships are being purchased? ");
        numMemberships = getValidInput(keyboard);

        for (int membershipNumber = 0; membershipNumber < numMemberships; membershipNumber++) {
            displayMenu();
            choice = getValidMenuChoice(keyboard);

            System.out.print("How many months will the membership last? ");
            numMonths = getValidInput(keyboard);

            costPerMonth = getCostPerMonth(choice, ADULT_CHOICE, CHILD_CHOICE, ADULT_COST, CHILD_COST, SENIOR_COST);

            totalCost = costPerMonth * numMonths;

            if (firstMembership) {
                cheapestMembership = totalCost;
                firstMembership = false;
            } else {
                if (totalCost < cheapestMembership)
                    cheapestMembership = totalCost;
            }

            System.out.printf("The cost of the membership is $%.2f\n", totalCost);
            System.out.println();
        }

        System.out.printf("The cheapest membership purchased is $%.2f\n", cheapestMembership);
    }

    private static void displayMenu() {
        System.out.println("Health Club Membership Menu");
        System.out.println("1. Standard Adult Membership - $40 per month");
        System.out.println("2. Child Membership - $20 per month");
        System.out.println("3. Senior Citizen Membership - $30 per month");
        System.out.print("\nEnter your choice: ");
    }

    private static int getValidMenuChoice(Scanner keyboard) {
        int choice = keyboard.nextInt();
        while (choice < 1 || choice > 3) {
            System.out.print("Invalid selection. Please pick a valid option from the menu: ");
            choice = keyboard.nextInt();
        }
        return choice;
    }

    private static int getValidInput(Scanner keyboard) {
        int input = keyboard.nextInt();
        while (input < 1) {
            System.out.print("Invalid input. Please enter a valid number: ");
            input = keyboard.nextInt();
        }
        return input;
    }

    private static double getCostPerMonth(int choice, int ADULT_CHOICE, int CHILD_CHOICE,
                                           double ADULT_COST, double CHILD_COST, double SENIOR_COST) {
        double costPerMonth;
        if (choice == ADULT_CHOICE)
            costPerMonth = ADULT_COST;
        else if (choice == CHILD_CHOICE)
            costPerMonth = CHILD_COST;
        else
            costPerMonth = SENIOR_COST;
        return costPerMonth;
    }
}
