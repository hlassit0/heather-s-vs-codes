import java.util.Scanner;

public class BankServiceFeesProgramPractice2
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int numberOfChecks = getNumberOfChecks(scanner);
            if (numberOfChecks == -1) break;
            double serviceFee = calculateServiceFee(numberOfChecks);
            displayBankFees(serviceFee);
        }
    }

    public static int getNumberOfChecks(Scanner scanner) {
        while (true) {
            System.out.println("Enter the number of checks written for the month, or -1 to quit: ");
            int numberOfChecks = scanner.nextInt();
            if (numberOfChecks >= -1) return numberOfChecks;
            System.out.println("Invalid input. Please enter a non-negative number.");
        }
    }

    public static double calculateServiceFee(int numberOfChecks) {
        double checkFee;
        if (numberOfChecks < 20) checkFee = 0.10;
        else if (numberOfChecks < 40) checkFee = 0.08;
        else if (numberOfChecks < 60) checkFee = 0.06;
        else checkFee = 0.04;
        return 10 + checkFee * numberOfChecks;
    }

    public static void displayBankFees(double serviceFee) {
        System.out.printf("The bank's service fees for the month are $%.2f\n", serviceFee);
    }
}