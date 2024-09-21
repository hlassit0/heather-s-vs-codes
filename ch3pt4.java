import java.util.Scanner;
public class ch3pt4
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      char packageLetter;
      int numOfHours;
      double cost;
      
      final double PACKAGE_A_BASE = 9.95;
      final double PACKAGE_B_BASE = 13.95;
      final double PACKAGE_C_BASE = 19.95;
      
      final int PACKAGE_A_HOUR_ALLOTMENT = 10; 
      final int PACKAGE_B_HOUR_ALLOTMENT = 20; 
      
      final double PACKAGE_A_OVERAGE_FEE = 2;
      final double PACKAGE_B_OVERAGE_FEE = 1;
      
      System.out.println("Pleaser enter the package u have purchased (A,B, or C):");
      packageLetter = keyboard.nextLine().charAt(0); // use first char of user input 
      
      System.out.print("please enter how many hours u used last month (in whole hours): ");
      numOfHours = keyboard.nextInt();
      
      switch(packageLetter)
      { 
         case 'a':
         case 'A':
            cost = PACKAGE_A_BASE; // cost of package a
            if(numOfHours > 10)
            {
               cost += (numOfHours - PACKAGE_A_HOUR_ALLOTMENT) * PACKAGE_A_OVERAGE_FEE; //add 2 per hour that we went over 
            }
            break;
         case 'b':
         case 'B':
            cost = PACKAGE_B_BASE; // cost of package b
            if(numOfHours > PACKAGE_B_HOUR_ALLOTMENT)
            {
               cost += (numOfHours - PACKAGE_B_HOUR_ALLOTMENT) * PACKAGE_B_OVERAGE_FEE; //add 1 per hour that we went over 
            }
            break;
         case 'c':
         case 'C':
            cost = PACKAGE_C_BASE; // cost of package c 
            break;
         default:
            cost = 19.95; //default to package c cost 
      }
       System.out.printf("your cost for the month is: $%.2f", cost);  
   
   }
}