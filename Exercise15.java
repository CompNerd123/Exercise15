/*Eugene Vasquez
COSC/ITSE
Exercise 15
Gets user input(integer)
Grabs all even numbers
Gets sum of those even numbers
Anything less than two; outputs error*/


import java.util.Scanner;

public class Exercise15
{    
    public static void main(String[] args)
    {
        int limit = 0;
        int sum   = 0;
        int intMin =2;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Limit: ");
        limit = scan.nextInt();
        
        System.out.println("The sum of the even numbers between 2 and " + limit + "  are:");
        
        for (int count = 1; count <= limit; count++)
        {
            
            if((count & 1)!= 1)
            {
              sum+=count;
              System.out.println(count);
            }
            else if(limit<intMin)
            {
              System.out.println("Uh oh...seems like ya put in too low of a number!");
            }

        }
        System.out.println("The sum is " + sum);
        
    }
}
