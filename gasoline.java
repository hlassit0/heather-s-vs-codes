/*Complete this assignment in one sitting as if it were an exam.  Allow only 2 hours to write the program using ONLY your textbook for help. 

Write a program that will calculate and display the cost of a gasoline purchase based on the brand of gasoline, the octane rating and the amount purchased.  

Your program should first display a menu prompting the user for the brand of gasoline, then prompt the user for the octane rating.  Next prompt the user for the amount of gasoline in liters. 

Finally, your program should calculate and display the cost of the gasoline purchase using the formulas below.

Cost of Discount Gasoline = ($2.49 - (100 - Octane Rating) * 0.01) * Number of Gallons
Cost of Premium Gasoline = ($2.99 - (100 - Octane Rating) * 0.01) * Number of Gallons
Notice that the units of measure for the amount of gasoline in the formulas are in gallons (not liters).  You will need to convert liters into gallons using this conversion factor: 1 liter = 0.264172 gallons*/

import java.util.Scanner;
public class gasoline
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int gasBrand, octane
      double gasInLiters, gasInGallons, totalcost = 0, baseprice = 0;
      
      final double GALLONS_PER_LITERS = .264172;
      
      System.out.println("CPCC Gasoline Services");
      System.out.println(" Discount:");
      System.out.println(" Premium:"); 
      
      System.out.println("Enter the brand type");
      double brandType = keyboard.nextDouble(); 
      
      System.out.println("\n enter octane rating: ");
      
      
      
      
   
   }
}
