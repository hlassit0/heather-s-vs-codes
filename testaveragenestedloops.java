import java.util.Scanner;
public class testaveragenestedloops
{
   public static void main(String [] args)
   {
      int numStudents;
      int numTests;
      int score;
      int total;
      double average;
      
      // create scanner
      Scanner keyboard = new Scanner(System.in);
      
      // get # of students
      System.out.println("how many students do you have?");
      numStudents = keyboard.nextInt();
      
      // get num of test scores per student
      System.out.println("how many tests scores per student?");
      numTests = keyboard.nextInt();
      
      //process all students
      for (int student = 1; student <= numStudents; student++)
      {
         total = 0; // set accumulator to zero 
         
         //get test scores for student 
         System.out.println("student number " + student);
         
         for (int test = 1; test <= numTests; test++);
         {
            score = keyboard.nextInt();
            total += score; // add score to total 
         }
            // calculate and display average 
            average = total / numTests;
            System.out.printf("the average for student %d is %.1f.\n\n", student, average);
      }
         
         
         
   }
}