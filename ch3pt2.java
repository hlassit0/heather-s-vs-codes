import java.util.Scanner;
public class ch3pt2
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int choice;
      char output;
      
      System.out.print("enter a number between 1 and 3");
      choice = keyboard.nextInt();
      
      switch(choice) // switch on the choice variable 
      {
         case 1:
           output = 'A'; 
           break;
         case 2:
            output = 'B';
            break;
         case 3:
            output = 'C';
            break;
         default: 
            output = '?'; 
      }
         System.out.println("switch:" + output);
      
      
      
      if(choice == 1){
         output = 'A';
      }
      else if (choice == 2){
         output = 'B';
      }
      else if (choice == 3){
         output = 'C';
      }
      else{
         output = '?';
      }
     
      System.out.println("if-else-if:" + output);
     
   
   }
}