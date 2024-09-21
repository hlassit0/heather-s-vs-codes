import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        // Prompt the user for a positive non-zero integer
        do {
            System.out.print("Enter a positive non-zero integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number. Please enter a positive non-zero integer.");
                scanner.next(); // this is important!
            }
            number = scanner.nextInt();
        } while (number <= 0);
        
        int sum = 0;
        
        // Calculate the sum of all numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        // Display the result
        System.out.println("The sum of all numbers from 1 to " + number + " is: " + sum);
        scanner.close();
    }
}
