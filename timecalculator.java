import java.util.Scanner;
public class timecalculator
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("please eneter a number of seconds");
      double seconds = keyboard.nextDouble();
      
      final double secondsHour = 60;
      final double secondsDay =  3600;
      final double secondsMin = 86400;
      
      if(seconds >= 60)
         {
            System.out.println(" there are this many minutes in that time" + secondsMin);
         }
      else if(seconds >= 3600)
         {
            System.out.println("there are this many days in that time" + secondsHour);
         }
      else if (seconds >= 86400)
         {
            System.out.println("there are this many days in that time" + secondsDay);
         }
      else 
         {
            System.out.println(" seconds " + seconds);
         }
      
      
       
      
     
   
   
   
   
   }
}