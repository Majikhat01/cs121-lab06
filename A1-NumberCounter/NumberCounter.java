/**
 * Program that takes and arbitrary number of integer inputs and prints the number of times
 * each integer was input.
 * @author Calvin Hatfield
 */
import java.util.Scanner;

public class NumberCounter
{
        public static void main(String[] args)
        {
                int[] intArray = new int[51];
                
                System.out.println("Enter any integers between 0 and 50.");
                System.out.println("When you are done, enter any number greater than " + 
                "50 to get the count of each integer.");
                System.out.println("Enter Integers: ");
                
                Scanner scan = new Scanner(System.in);
                int userInt = scan.nextInt();

                while (userInt >= 0 && userInt <= 50)
                {
                    intArray[userInt] = intArray[userInt] + 1;
                    System.out.println("Enter Integer: ");
                    userInt = scan.nextInt();
                }
                scan.close();

                System.out.println("Number of times each integer was entered:");

                for (int i=0; i < 51; i++)
                {
                    if (intArray[i] > 0)
                    {
                        System.out.println(i + ": " + intArray[i]);
                    }
                }
        }
}
