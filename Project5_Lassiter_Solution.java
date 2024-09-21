import java.util.Scanner; 

public class Project5_Lassiter_Solution
{
   public static void main(String[]args)
   {
      //create a Scanner object used to read input from the console
      Scanner keyboard = new Scanner(System.in);
      
      //create variables to hold user input and any values calculated from them
      double gpuClockSpeed = 0,  
             cpuClockSpeed = 0, 
             multiplier = 0,
             performanceScore = 0,
             
             average = 0,
             totalPerformanceScores = 0;
                          
      int cpuCoreNumber = 0,
          monitorResolution = 0,
          numOfComputers = 0;
          
      String processor = "",
             input = "",
             recommendedQuality = "",
             monitorResolutionAsString = "";
                 
      char   overclock = ' ',
             repeat = ' ';
       
          
      //declare constants for values used in input validation ranges
      final double CLOCK_SPEED_GPU_LOW_THRESHOLD = 800,   
                   CLOCK_SPEED_GPU_HI_THRESHOLD = 2000,
                   CLOCK_SPEED_CPU_LOW_THRESHOLD = 1000,   
                   CLOCK_SPEED_CPU_HI_THRESHOLD =5500;   
                   
      final int CORES_LOW_THRESHOLD = 1,
                CORES_HI_THRESHOLD = 20, 
                computerNum = 0;       
   
         
      //post-test loop         
  do {

      
          //display the title
         System.out.println(); 
         displayTitle();
         System.out.println();
        
        //get the user's input and validate input
         System.out.print("Please enter the type of processor: ");
         processor = keyboard.nextLine();
 
                
         System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
         gpuClockSpeed = keyboard.nextDouble();
         
         //validate the input
         while(gpuClockSpeed < CLOCK_SPEED_GPU_LOW_THRESHOLD || gpuClockSpeed > CLOCK_SPEED_GPU_HI_THRESHOLD)
         {
            System.out.println("The clock speed should be between " + CLOCK_SPEED_GPU_LOW_THRESHOLD + " and " + CLOCK_SPEED_GPU_HI_THRESHOLD + " Megahertz.");
            System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
            gpuClockSpeed = keyboard.nextDouble();
         }
      
         System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
         cpuClockSpeed = keyboard.nextDouble();
         
         //validate the input
         while(cpuClockSpeed < CLOCK_SPEED_CPU_LOW_THRESHOLD || cpuClockSpeed > CLOCK_SPEED_CPU_HI_THRESHOLD)
         {
            System.out.println("The clock speed should be between " + CLOCK_SPEED_CPU_LOW_THRESHOLD + " and " + CLOCK_SPEED_CPU_HI_THRESHOLD + " Megahertz.");
            System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
            cpuClockSpeed = keyboard.nextDouble();
         }
      
         System.out.print("Please enter the number of cores of your processor: ");
         cpuCoreNumber = keyboard.nextInt();
         
         //validate the input
         while(cpuCoreNumber < CORES_LOW_THRESHOLD || cpuCoreNumber > CORES_HI_THRESHOLD)
         {
            System.out.println("The number of cores should be between " + CORES_LOW_THRESHOLD + " and " + CORES_HI_THRESHOLD + ".");
            System.out.print("Please enter the number of cores of your processor: ");
            cpuCoreNumber = keyboard.nextInt();
         }
      
         keyboard.nextLine();
      
         System.out.print("Is the hardware overclock-friendly? (Enter y for yes or n for no): ");
         input = keyboard.nextLine().toLowerCase(); //convert the input to all lowercase
         overclock = input.charAt(0);
      
         while(overclock != 'y' && overclock != 'n') 
         {
            System.out.print("Only y for yes or n for no should be entered. Please enter a valid letter: ");
            input = keyboard.nextLine().toLowerCase(); //convert the input to all lowercase
            overclock = input.charAt(0);
         }
        
         System.out.println("What is the resolution of your monitor?");
         System.out.println("\t1. 1280 x 1024");
         System.out.println("\t2. 1366 x 786");
         System.out.println("\t3. 1600 x 900");
         System.out.println("\t4. 1920 x 1080");
         System.out.print("Please select from the options above: "); 
         monitorResolution = keyboard.nextInt();
         
         //validate the input
         while(monitorResolution < 1 || monitorResolution > 4)
         {
            System.out.print("Invalid menu selection. Please select from the options above: "); 
            monitorResolution = keyboard.nextInt();
         }
         
         //create a computer object; call the set methods to assign values          
         //the computer object is of the HardwareLastname class type
         HardwareLastname comp = new HardwareLastname();
      
         comp.setProcessor(processor);
         comp.setGpuClockSpeed(gpuClockSpeed);
         comp.setCpuClockSpeed(cpuClockSpeed);
         comp.setCpuCoreNumber(cpuCoreNumber);
         comp.setMonitorResolution(monitorResolution);
         comp.setOverClock(overclock);
         
         //call the display method to output the results
         System.out.println();
         comp.displayInformation();
         System.out.println();  
         
         keyboard.nextLine();
         
         System.out.print("\nWould you like to enter another computer? y/n: ");
         input = keyboard.nextLine().toLowerCase(); //convert the input to all lowercase
         repeat = input.charAt(0);      
          
         while(repeat != 'y' && repeat != 'n') 
         {
            System.out.print("Only y for yes or n for no should be entered. Please enter a valid letter: ");
            input = keyboard.nextLine().toLowerCase(); //convert the input to all lowercase
            repeat = input.charAt(0);
         }

         
         
         //keep track of how many computers are entered. This increases every loop
         numOfComputers++;
         
         //keep a running total of the performance scores to calculate the average
         totalPerformanceScores += comp.calculatePerformanceScore();
         
         System.out.println();
         
      } while (repeat == 'y');
      
      //calculate the average score by dividing the running total by the total number of computers
      average = totalPerformanceScores / numOfComputers;
      
      //display the average performance score
      System.out.printf("The average performance score is: %,.3f", average);

             
  }

 
   
   /**
      The displayTitle method displays the title
   */
   public static void displayTitle()
   {
      String title = "Graphics Quality Recommendation Tool";
      System.out.println(title);
   }
}