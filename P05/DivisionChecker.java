import java.util.*;

public class DivisionChecker
{
    public static void main(String [] args)
    { 
        int numOne, numTwo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        numOne = sc.nextInt();
        System.out.println("Enter Second Number");
        numTwo = sc.nextInt();
        String result = divisionCheck(numOne, numTwo);
        System.out.println(result);
    }//end main
    
    /**
     *Submodule will return "Divisible" if MOD of inputed numbers equals 0 otherwise submodule will return "Not Divisible"
     */ 
    public static String divisionCheck(double numOne, double numTwo)
    {
        String returnString;
        if(numOne%numTwo==0)
        {
            returnString = "Divisible";
        }
        else
        { 
            returnString = "Not Divisible";
        }
        return returnString;
    }
}
