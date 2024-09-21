import java.util.Scanner;

public class exan1 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in); // scanner 
      
      // Constants
      final double SHOOTING_SESSION = 65.99;
      final double BALL_HANDLING = 79.99;
      final double DISCOUNT = 0.15;
      final String DISCOUNT_CODE = "HOOP15STAR";
      
      // Variables 
      int minutes = 0; 
      char session_type; 
      double totalPay = 0, discountAmount = 0, hourlyRate = 0, sessionDuration = 0;
      String sessionTypeName = "";
      
      // Menu for user usage
      System.out.println("Book a session with a basketball trainer now!");
      System.out.println("Choose from one of the following types of basketball training services: \n S- Shooting Session \n B- Ball Handling Session");
      System.out.print("Enter your choice (S or B): ");
      session_type = keyboard.nextLine().toUpperCase().charAt(0);
      
      // User picks which hourly rate will be used here 
      if (session_type == 'S') {
         System.out.println("Shooting Session rate: " + SHOOTING_SESSION);
         hourlyRate = SHOOTING_SESSION;
         sessionTypeName = "Shooting Session";
      } else if (session_type == 'B') {
         System.out.println("Ball Handling Session rate: " + BALL_HANDLING);
         hourlyRate = BALL_HANDLING;
         sessionTypeName = "Ball Handling Session";
      } else {
         System.out.println("Invalid session choice. Please restart the booking process.");
         keyboard.close();
         return; // Exit the program if invalid session choice
      }
     
     // Determining if # of min is within 50-180
     if (hourlyRate > 0) {
         System.out.print("Enter the total minutes of the Basketball training session (min: 50 - max: 180): ");
         minutes = keyboard.nextInt();
         keyboard.nextLine();
         
         if (minutes < 50 || minutes > 180) { 
            System.out.println("Invalid entry. 55 Minute Basketball Training Session booked.");
            minutes = 55;
         }
     }
      
     // Calculate for receipt 
     sessionDuration = minutes / 50.0;
     totalPay = sessionDuration * hourlyRate;
     double initialTotalPay = totalPay;
   
     // Discount code entered here 
     System.out.println("There is a promotional discount available! Enter the discount code: ");
     String userInput = keyboard.nextLine(); 
    
     if (userInput.equals(DISCOUNT_CODE)) {
         discountAmount = totalPay * DISCOUNT;
         totalPay -= discountAmount;
         System.out.println("15% Discount Applied!");
     } else {
         System.out.println("Invalid Code. NO discount applied!");
     }
   
     // Receipt
     System.out.println("Basketball Training Session Info");
     System.out.println("Session Type: " + sessionTypeName);
     System.out.printf("Session Duration: %.2f hour(s)\n", sessionDuration);
     System.out.println("Session Rate: $" + hourlyRate);
     System.out.printf("Session Charge: $%.2f\n", initialTotalPay); 
     System.out.printf("Discount: $%.2f\n", discountAmount); 
     System.out.printf("Amount Due: $%.2f\n", totalPay);   

     keyboard.close();
   }
}
