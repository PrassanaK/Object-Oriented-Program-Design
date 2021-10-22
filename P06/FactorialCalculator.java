import java.util.*;
public class FactorialCalculator
{
    public static void main(String [] args)
    {
        int number, i, fact; 
        fact = 1;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a number that you want to find the factorial of");
        number = sc.nextInt();

        if (number < 0)
            System.out.println("Please enter a positive number");
        else
        {
            for ( i = 1 ; i <=number ; i++)
                fact = fact*i;
                System.out.println("Factorial of " + number + " = " +fact);
        }
    }
}
      
        

