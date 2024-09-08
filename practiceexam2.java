import java.util.Scanner;

public class practiceexam2
 {
    private static final Scanner scanner = new Scanner(System.in);  // Single Scanner instance for the class
     // ask user for membership type 
    public static String getMembershipType() 
    {
        System.out.println("Book your guitar lessons today! \n");
        System.out.println("Enter your membership type: 'Silver' or 'Gold'");
        String membershipType = scanner.nextLine();
        // validate membership type
        while (!membershipType.equalsIgnoreCase("Silver") && !membershipType.equalsIgnoreCase("Gold"))
        {
            System.out.println("Invalid membership type. Please enter 'Silver' or 'Gold'");
            membershipType = scanner.nextLine();
        }
        return membershipType;
    }
    // base cost of membership 
    public static double getBaseCost(String membershipType)
    {
        if (membershipType.equalsIgnoreCase("Silver")) {
            return 56.45;
        } else if (membershipType.equalsIgnoreCase("Gold")) {
            return 75.85;
        } else {
            return 0.0;
        }
    }
    // free lessons included with memberships
    public static int getMaxFreeLessons(String membershipType)
     {
        if (membershipType.equalsIgnoreCase("silver")) {
            return 1;
        } else if (membershipType.equalsIgnoreCase("gold")) {
            return 3;
        } else {
            return 0;
        }
    }
    // hourly rates 
    public static double getHourlyRate(String membershipType) 
    {
        if (membershipType.equalsIgnoreCase("silver")) {
            return 18.95;
        } else if (membershipType.equalsIgnoreCase("gold")) {
            return 16.75;
        } else {
            return 0.0;
        }
    }
    // get num of hours and validate them
    public static double getLessonHours() 
    {
        double hours = 0;
        do {
            System.out.println("How many hours are you looking to book for this guitar lesson? (min: 1 hour, max: 3.5 hours)");
            if (scanner.hasNextDouble())
             {
                hours = scanner.nextDouble();
                scanner.nextLine();  // Consume the newline 
                if (hours < 1 || hours > 3.5) {
                    System.out.println("Invalid number of hours. Please enter a number between 1 and 3.5");
                }
            } else
            {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();  // Clear invalid input
            }
        } while (hours < 1 || hours > 3.5);
        return hours;
    }

    public static void displayMembershipInfo(String membershipType, int remainingFreeLessons, double hourlyRate, double lessonHours, double cost) 
    {
       
        System.out.println("--------------------------------------------------------");
        System.out.println("Membership Type: " + membershipType + " Membership base cost: " + cost);
        System.out.println("NOTE: you have " + remainingFreeLessons + "remaining free in your membership. \n you will be charged at a rate of " + hourlyRate + " per hour for guitar lessons if you exceed the free lessons.");
    
    }

    public static double calculateLessonPrice(int remainingFreeLessons, double hourlyRate, double lessonHours)
     {
        if (remainingFreeLessons > 0 && lessonHours > 1) {
            lessonHours -= 1;  // free lesson hour
            return (lessonHours * hourlyRate);  // Charge for additional hours
        } else if (remainingFreeLessons > 0) {
            return 0;  // No charge if within free lesson hours
        } else {
            return hourlyRate * lessonHours;  // No free lessons left
        }
    }

    public static void displayFinalInvoice(double baseCost, int totalLessonsBooked, double totalLessonHours, double totalLessonCharges) 
    {   
        System.out.println("**************INVOICE****************");
        System.out.println("--------------------------------------------------------");
        System.out.println(" Membership base Cost: " + baseCost);
        System.out.println("Number of Guitar Lessons: " + totalLessonsBooked);
        System.out.println("Total Hours of Guitar Lessons: " + totalLessonHours);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Guitar Lesson Charges: " + totalLessonCharges);
    }
    // main method 
    public static void main(String[] args) 
    {
        String membershipType = getMembershipType();
        int remainingFreeLessons = getMaxFreeLessons(membershipType);
        double baseCost = getBaseCost(membershipType);
        double hourlyRate = getHourlyRate(membershipType);

        displayMembershipInfo(membershipType, remainingFreeLessons, hourlyRate, 0, baseCost);

        double totalLessonCharges = baseCost;
        int serviceCount = 0;
        double totalLessonHours = 0;

        while (true) {
            System.out.println("Enter 'y' or 'yes' to book a guitar lesson. Enter 'no' or 'n' to stop and process your invoice.");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                break;
            }

            double lessonHours = getLessonHours();
            double lessonPrice = calculateLessonPrice(remainingFreeLessons, hourlyRate, lessonHours);

            if (remainingFreeLessons > 0 && lessonHours >= 1) {
                remainingFreeLessons--;  // Deduct one free lesson if applicable
            }

            totalLessonCharges += lessonPrice;
            serviceCount++;
            totalLessonHours += lessonHours;
        }

        displayFinalInvoice(baseCost, serviceCount, totalLessonHours, totalLessonCharges);
    }
}
