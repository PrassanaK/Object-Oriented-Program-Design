//*********************************************************************************
//Name: Prassana Kamalakannan
//Filename: ShapeCalculator.java
//Date: 12/09/2017
//Function: Inputs measurements of shapes and calculates their areas using a menu
//*********************************************************************************
import java.util.*;
public class ShapeCalculator
{
   public static void main( String [] args)
   {
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Press c(Circle), r(Rectangle), t(Triangle), e(Exit)");
        choice = sc.next().charAt(0);
        /**
         *Present a set of choices to user of what shape they want to calculate the area of
         *
         */  
        switch(choice)//Case used instead of IF ELSE because it would become too big and unreadable
        {
            case 'c':
                circleCalc();
                break;
            case 'r':
                rectangleCalc();
                break;
            case 't':
                triangleCalc();
                break;
            case 'e':
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Please enter valid options only");
        }//end case choice
  
   }//end main


   public static void circleCalc()//Calls calcCircleArea and extractOutput submodules and outputs the split area
   {
    double circleDiameter;
    double area;
    circleDiameter = (double)integerInput("Circle Diameter");
    area = calcCircleArea(circleDiameter);
    extractOutput(area);            
   }//end circleCalc


   public static void rectangleCalc()//Calls calcRecArea and extractOutput submodules and outputs the split area
   {
    double rectangleLength;
    double rectangleWidth;
    double area;
    rectangleLength = (double)realInput("Rectangle Length");//realInput is called. "Rectangle Length is String1, shapeInput is stored in rectangleLength
    rectangleWidth = (double)realInput("Rectangle Width");//realInput is called. "Rectangle Width is String1, shapeInput is stored in rectangleWidth
    area = calcRecArea(rectangleLength, rectangleWidth);//Area of rectangle is calculated. Value of return statement is stored in area
    extractOutput(area);//extractOutput is called with area as its import arguement which outputs the split up area of a rectangle
   }//end rectangleCalc


   public static void triangleCalc()//Calls calcTriArea and extractOutput submodules and outputs the split area
   {
    double triangleBase;
    double triangleHeight;
    double area;
    triangleBase = (double)realInput("Triangle Base");//realInput is called. "Triangle Base" is String1, shapeInput is stored in triangleBase
    triangleHeight = (double)realInput("Triangle Height");//realInput is called. "Triangle Width" is String1, shapeInput is stored in triangleWidth
    area = calcTriArea(triangleBase, triangleHeight);//Area of rectangle is calculated. Value of return statment is stored in area
    extractOutput(area);//extractOutput is called with area as its import arguement which outputs the split up area of a rectangle
   }//end triangleCalc


   public static double calcCircleArea(double circleDiameter)//Calculates area of circle. Input in cm
   {
    return Math.PI*((double)(circleDiameter)/2.0)*((double)(circleDiameter)/2.0);
   }//end calcCircleArea


   public static double calcRecArea(double rectangleLength, double rectangleWidth)//Calculates area of rectangle. Input in cm
   {
    return rectangleLength*rectangleWidth;
   }//end calcRecArea


   public static double calcTriArea(double triangleBase, double triangleHeight)//Calculates area of triangle. Input in mm
   {
     return ((triangleBase/10.0)*(triangleHeight/10))/2.0;//triangleBase and triangleHeight both divided by 10 to convert them to mm
   }//end calcTriArea


   public static int integerInput(String String1)
   { 
     Scanner sc = new Scanner(System.in);
     int shapeInput;    
     System.out.println("Enter " + String1);
     shapeInput = sc.nextInt();
     return shapeInput;
   }//end integerInput


   public static double realInput(String String1)//Submodule is used for Inputting real numbers onyl
   {
     Scanner sc = new Scanner(System.in);
     double shapeInput;
     System.out.println("Enter " + String1);
     shapeInput = sc.nextDouble();
     return shapeInput;
   }//end realInput


   public static void extractOutput(double area)//Submodule splits the areas of each of the shapes into m^2, cm^2, mm^2
   {
     double mmSqrd;
     double cmSqrd;
     double mSqrd;
     mmSqrd = (area -(int)area)*100.0;
     cmSqrd = ((int)area)%10000;
     mSqrd = ((int)area)/10000;
     System.out.println("Area= " + mSqrd + "m^2 " + cmSqrd + "cm^2 " + mmSqrd + "mm^2 ");
     
   }//end extractOutput

}// End Class

