import java.util.*;
public class MyFirstJavaApplication
{
   public static void main( String [] args)
   {
     int numOne, numTwo, sum, difference;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter 1st number");
     numOne = sc.nextInt(); 
     System.out.println("Enter 2nd number");
     numTwo = sc.nextInt();

     sum = numOne + numTwo;
     difference = Math.abs(numOne - numTwo);

     System.out.println("Difference is " + difference);
     System.out.println("Sum is " + sum);
   }
}
