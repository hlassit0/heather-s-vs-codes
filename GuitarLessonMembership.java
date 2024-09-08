import java.util.Scanner;

public class GuitarLessonMembership
 {
    
    public static String getMembershipType() 
    {
        Scanner scanner = new Scanner(System.in);
        String membershipType;
        
        System.out.println("Book your guitar lessons today! \n");
        System.out.println("Enter your membership type: 'Silver or 'Gold'");
        membershipType = scanner.nextLine();

        while (!membershipType.equalsIgnoreCase("Silver") && !membershipType.equalsIgnoreCase("Gold")) 
        {
            System.out.println("Invalid membership type. Please enter 'Silver' or 'Gold'");
            System.out.println("Enter your membership type: 'Silver' or 'Gold'");
            membershipType = scanner.nextLine();
        }
        return membershipType;
    }

    public static double getBaseCost(String membershipType) 
    {
        if (membershipType.equalsIgnoreCase("Silver")) 
            return 56.45;
        else if (membershipType.equalsIgnoreCase("Gold")) 
            return 75.85;
        else 
            return 0.0;
        
    }
    public static int getMaxFreeLessons(String membershipType) 
    {
        if (membershipType.equalsIgnoreCase("silver"))
            return 1;
        else if (membershipType.equalsIgnoreCase("gold"))
            return 3;
        else
            return 0;
        
    }
    public static double getHourlyRate(String membershipType) 
    {
        if (membershipType.equalsIgnoreCase("silver")) 
            return 18.95;
        else if (membershipType.equalsIgnoreCase("gold")) 
            return 16.75;
        else 
            return 0.0;
    }
    public static double getLessonHours(Scanner scanner, String membershipType, int remainingFreeLessons, double hourlyRate) {
        double hours = 0;
        do {
            System.out.println("How many hours are you looking to book for this guitar lesson? (min: 1 hour, max: 3.5 hours)");
            if (scanner.hasNextDouble()) {
                hours = scanner.nextDouble();
                if (hours < 1 || hours > 3.5) {
                    System.out.println("Invalid number of hours. Please enter a number between 1 and 3.5");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // to clear the invalid input
            }
        } while (hours < 1 || hours > 3.5);
        return hours;
    }
    
            public static void displayMembershipInfo(String membershipType, int remainingFreeLessons, double hourlyRate, double lessonHours, double cost)
        {
            System.out.println("--------------------------------------------------------");
            System.out.println("Membership Type: " + membershipType);
            System.out.println("Remaining Free Lessons: " + remainingFreeLessons);
            if (remainingFreeLessons > 0) {
                if (membershipType.equalsIgnoreCase("silver")) {
                    System.out.println("NOTE: you have " + remainingFreeLessons + " remaining free lessons with your Silver membership. \t You will be charged at a rate of $18.95 per hour for guitar lessons if you exceed the free lessons.");
                } else if (membershipType.equalsIgnoreCase("gold")) {
                    System.out.println("NOTE: you have " + remainingFreeLessons + " remaining free lessons with your Gold membership. \t You will be charged at a rate of $16.75 per hour for guitar lessons if you exceed the free lessons.");
                }
            }
            System.out.println("Hourly Rate: " + hourlyRate);
        }
        public static void displayFinalInvoice(double baseCost, int totalLessonsBoked, double totalLessonHours, double totalLessonCharges)
        {
            System.out.println("Base Cost: " + baseCost);
            System.out.println("Total Lessons Booked: " + totalLessonsBoked);
            System.out.println("Total Lesson Hours: " + totalLessonHours);
            System.out.println("Total Lesson Charges: " + totalLessonCharges);
        }
        public static double calculateLessonPrice (int remainingFreeLessons, double hourlyRate, double lessonHours)
        {

           double lessonPrice = 0;
            if (remainingFreeLessons > 0) {
            lessonHours -= 1; // This reduces the lesson hours but doesn't account for the rest if more than 1 hour was booked
            remainingFreeLessons -= 1;
                }                else {
                lessonPrice = hourlyRate * lessonHours;
                        }
                return lessonPrice;

        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object once and use it throughout the class
        
            System.out.println("Enter your membership type (Gold/Silver): ");
            String membershipType = scanner.nextLine();
        
            int remainingFreeLessons = getMaxFreeLessons(membershipType);
            double baseCost = getBaseCost(membershipType);
            double hourlyRate = getHourlyRate(membershipType);
            double lessonHours = getLessonHours(scanner, membershipType, remainingFreeLessons, hourlyRate);
        
            displayMembershipInfo(membershipType, remainingFreeLessons, hourlyRate, lessonHours, baseCost);
        
            double totalLessonCharges = baseCost;
            int serviceCount = 0;
        
            while (true) {
                System.out.println("Enter 'y' or 'yes' to book a guitar lesson. Enter 'no' or 'n' to stop and process your invoice.");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                    break;
                }
        
                serviceCount++;
        
                double lessonPrice = calculateLessonPrice(remainingFreeLessons, hourlyRate, lessonHours);
        
                if (remainingFreeLessons > 0) {
                    remainingFreeLessons--;
                }
        
                totalLessonCharges += lessonPrice;
            }
        
            displayFinalInvoice(baseCost, serviceCount, lessonHours, totalLessonCharges);
        }
        
 }