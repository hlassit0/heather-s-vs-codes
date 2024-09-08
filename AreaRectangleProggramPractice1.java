/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.
import java.util.Scanner;
public class AreaRectangleProggramPractice1
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);
   
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area

   
      // Get the rectangle's length from the user.
      length = getLength(keyboard);
   
      // Get the rectangle's width from the user.
      width = getWidth(keyboard);

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   
   public static double getLength(Scanner keyboard)
   {
      System.out.println("Enter the rectangle's length: ");
      return keyboard.nextDouble();
   }
   public static double getWidth(Scanner keyboard)
   {
      System.out.println("enter the width of the rectangle: ");
      return keyboard.nextDouble();
   }
   public static double getArea(double length, double width)
   {
      return length * width;
   }
   public static void displayData(double length, double width, double area)
   {
      System.out.println("The length of the rectangle is " + length);
      System.out.println("The width of the rectangle is " + width);
      System.out.println("The area of the rectangle is " + area);
   }
}

