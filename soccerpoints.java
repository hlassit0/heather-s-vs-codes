import java.util.Scanner;
public class soccerpoints
{
   public static void main(String[] args)
   {
      int points;
      int totalPoints = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("enter the number of points your team");
      System.out.println("has earned for each game this season.");
      System.out.println("enter -1 when finished.");
      System.out.println();
      
      System.out.print("enter game points or -1 to end: ");
      points = keyboard.nextInt();
      
      while (points != -1)
      {
         totalPoints += points;
         System.out.println("enter game points or -1 to end: " );
         points = keyboard.nextInt();
      }
      System.out.println("the total points are " + totalPoints);
   }
}