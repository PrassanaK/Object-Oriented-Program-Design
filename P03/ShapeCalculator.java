//*******************************************************************
//Name: Prassana Kamalakannan
//Filename: Shapecalculator.java
//Date:  21/08/2017
//Function: Inputs measurements of shapes and calculates their areas
//*******************************************************************
import java.util.*;
public class ShapeCalculator
{
   public static void main( String [] args)
   {
    Scanner sc = new Scanner(System.in);

    //Submodules that call other submodules to calculate the area of their respective shapes
    circleCalc();
    rectangleCalc();
    triangleCalc();
  
   }//end main


   public static void circleCalc()//Calls calcCircleArea and extractOutput submodules and outputs the split area
   {
    double circleDiameter;
    double area;
    circleDiameter = (double)integerInput("Circle Diameter");// integerInput is called. "Circle Diameter" is String1, shapeInput is stored in circleDiameter
    area = calcCircleArea(circleDiameter);//Area of circle is calculated. Value of return statement is stored in area
    extractOutput(area);//extractOutput is called with area as its import arguement which outputs the split up area of a circle
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


   public static int integerInput(String String1)//Generic Code to input integer numbers
   { 
     Scanner sc = new Scanner(System.in);
     int shapeInput;    
     System.out.println("Enter " + String1);
     shapeInput = sc.nextInt();
     return shapeInput;
   }//end integerInput


   public static double realInput(String String1)//Generic Code to input real numbers
   {
     Scanner sc = new Scanner(System.in);
     double shapeInput;
     System.out.println("Enter " + String1);
     shapeInput = sc.nextDouble();
     return shapeInput;
   }//end realInput


   public static void extractOutput(double area)//Generic Code to calculate and output the split up area to prevent unnecessary duplication of code
   {                                            //Submodules for the calculation of areas have same variable "area" so there is only one import arguement for extractOutput
     double mmSqrd;
     double cmSqrd;
     double mSqrd;
     mmSqrd = (area -(int)area)*100.0;
     cmSqrd = ((int)area)%10000;
     mSqrd = ((int)area)/10000;
     System.out.println("Area= " + mSqrd + "m^2 " + cmSqrd + "cm^2 " + mmSqrd + "mm^2 ");//Outputs string of split up area
     
   }//end extractOutput

}// End Class

