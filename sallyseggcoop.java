import java.util.Scanner;
public class sallyseggcoop
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      // constants
      final double DOZEN = 5;
      final double INDIVIDUAL = .5;
      final double DELIVERY_FEE = .05;
      final int MAX_MILES = 5;
      // declare variables
      int eggsInOrder = 0, miles = 0, dozens = 0, individuals = 0;
      double subtotal = 0, finalTotal = 0, fee = 0;
      String name = "", orderType = "", orderDisplay = "";
      char feedback;
      // asking for eggs in order
      System.out.println("WELCOME TO SALLY'S CHICKEN COOP");
      System.out.println("please enter the number of eggs in your order");
      eggsInOrder = keyboard.nextInt();
      keyboard.nextLine();
     
      // calcualte eggs 
      dozens = eggsInOrder / 12;
      individuals = eggsInOrder % 12;
      
      subtotal = (dozens * DOZEN) + (individuals * INDIVIDUAL);
      finalTotal = subtotal;
      
      //ask for name 
      System.out.print("Enter the name for the order: ");
      name = keyboard.nextLine();
      
      // delivery or pickup
      System.out.println("Please type D for Delivery or P for pickup");
      orderType = keyboard.nextLine();
      
      // determine if there is a fee based on miles in delivery 
      if(orderType.equalsIgnoreCase("D"))
      { 
         orderDisplay = "Delievery";
         System.out.print("How many miles away are you from our location? ");
         miles = keyboard.nextInt();
         keyboard.nextLine();
      
      if (miles > MAX_MILES)
      {
          finalTotal += subtotal * DELIVERY_FEE;
          System.out.println("A 5% fee has been added to your order.");
       }
       else
            System.out.println("No fee has been added to your order.");
      }
       else
         orderDisplay = "Pickup";
         
      // reciept for user 
      System.out.println("\nPlease review your reciept.");
      System.out.printf("Name for the order: %s\n", name);
      System.out.printf("Number of eggs: %d dozen and %d individual(s)\n", dozens, individuals);
      System.out.printf("Subtotal: $%.2f\n", subtotal);
      System.out.printf("Delivery/Pickup: %s\n", orderDisplay);
      System.out.printf("Final total: $%.2f\n", finalTotal);
      
      System.out.println("There are this many dozens in your order:" + dozens);
      System.out.println("There are this many individual eggs:" + individuals);
      
      // feedback
      System.out.print("did you enjoy our services Y/N");
      feedback = keyboard.nextLine().toUpperCase().charAt(0);
      
      if(feedback == 'Y')
      {
         System.out.println("Thanks! Have a good day!" + name);
      }
      else 
      {
         System.out.println("Sorry to hear that, we will work to fix the program. have a nice day.");
      }
      
      
   }
}
      
      