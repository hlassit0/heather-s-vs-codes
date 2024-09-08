import java.util.Scanner;

public class DistanceTraveled 
{
    public static void main(String[] args) 
    {
        double speed, time;
        Scanner keyboard = new Scanner(System.in);

        while (true) 
        {
            System.out.print("Enter the speed of the vehicle in mph: ");
            if (keyboard.hasNextDouble()) 
            {
                speed = keyboard.nextDouble();
                if (speed >= 0) break;
                else System.out.println("Speed cannot be negative. Please enter a valid value.");
            } else 
            {
                System.out.println("Invalid input. Please enter a valid number.");
                keyboard.next(); // discard the invalid input
            }
        }


    while (true)
     {
    System.out.print("Enter the number of hours the vehicle has traveled: ");
    if (keyboard.hasNextDouble())
     {
        time = keyboard.nextDouble();
        if (time >= 0) break;
        else System.out.println("Time cannot be negative. Please enter a valid value.");
    } else
     {
        System.out.println("Invalid input. Please enter a valid number.");
        keyboard.nextLine(); // discard the entire line of input
    
     }
        }

        System.out.println("Hour\tDistance Traveled");
        System.out.println("-------------------------");

        double totalDistance = 0;
        for (int hour = 1; hour <= time; hour++)
        {
            double distance = speed * hour;
            totalDistance += distance;
            System.out.println(hour + "\t\t" + distance);
        }

        System.out.println("The total distance traveled is " + totalDistance + " miles.");

        keyboard.close();
    }
}