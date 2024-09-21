

public class Bill {
   public static void main(String[] args) { 
   new Scanner(System.in);

   System.out.print("Enter the charge for the meal: $");
                     
   double taxAmount= mealCharge * 0.0675;

   double totalAfterTax = mealCharge + taxAmount;

   double tipAmount = totalAfterTax * 0.20;

   double totalBill = totalAfterTax + tipAmount;

   System.out.println(" Meal Charge is: $" + mealCharge);
   System.out.println("Tax amount is: $" + taxAmount);
   System.out.println("Tip Aount is: $" + tipAmount);
   System.out.println("Total Bill: $" + totalBill); 

   scanner.close();

   }
}