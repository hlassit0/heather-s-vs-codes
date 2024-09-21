import java.util.Scanner;
import java.io.*;
public class FileReadDemo
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the name of a file: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            String FriendName = inputFile.nextLine();
            System.out.println(FriendName);
        }

        inputFile.close();
        keyboard.close();

    }
}