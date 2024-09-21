import java.util.Scanner;
public class whiledowhile
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      double price, totalPrice = 0;
      String anotherItem;
      
      do 
      {
         
         
         System.out.println("enter the price of the item (or -1 to quit) ");
         price = keyboard.nextDouble();
         keyboard.nextLine(); // clear the new line left in buffer (ch2pt13)
         
         totalPrice += price; // add up total's 
         
         if (price != -1)
            totalPrice += price;
         
         
      }
      while(price > 0); //ch3pt6
      
      System.out.printf("ur total price is $%,.2f",  totalPrice);
     
   
   
   
   }
}
