import java.util.Scanner;

public class RemainderCalculatorProgramPractice3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String repeat;
        do
        {
            int firstNumber = getFirstNumber(scanner);
            int secondNumber = getSecondNumber(scanner);
            int remainder = calculateRemainder(firstNumber, secondNumber);
            displayRemainder(remainder);
            System.out.println("Would you like to repeat the process? (yes/no)");
            repeat = scanner.next();
        } while (repeat.equalsIgnoreCase("yes"));
    }

    public static int getFirstNumber(Scanner scanner)
    {
        System.out.println("Enter the first number: ");
        return scanner.nextInt();
    }

    public static int getSecondNumber(Scanner scanner)
    {
        int number;
        do {
            System.out.println("Enter the second number (cannot be 0): ");
            number = scanner.nextInt();
            if (number == 0)
            {
                System.out.println("Error: Divisor should be a nonzero number. Enter the second number again:");
            }
        } while (number == 0);
        return number;
    }

    public static int calculateRemainder(int firstNumber, int secondNumber)
    {
        return firstNumber % secondNumber;
    }

    public static void displayRemainder(int remainder)
    {
        System.out.println("Remainder is: " + remainder);
    }
}