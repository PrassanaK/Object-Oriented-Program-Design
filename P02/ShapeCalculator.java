import java.util.*;
public class ShapeCalculator
{
   public static void main( String [] args)
   {
     int circleDiameter;
     double rectangleLength, rectangleWidth, triangleBase, triangleHeight, areaOfCircle, areaOfRectangle, areaOfTriangle, circleAreaMSqrd, circleAreaCmSqrd, circleAreaMmSqrd,
     recAreaMSqrd, recAreaCmSqrd, recAreaMmSqrd, triAreaMSqrd, triAreaCmSqrd, triAreaMmSqrd;
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter Circle Diameter");
     circleDiameter = sc.nextInt();
     areaOfCircle = Math.PI*((double)(circleDiameter)/2.0)*((double)(circleDiameter)/2.0);
     circleAreaMSqrd = ((int)areaOfCircle)/10000;
     circleAreaCmSqrd = ((int)areaOfCircle)%10000;
     circleAreaMmSqrd = Math.round(((areaOfCircle - (int)areaOfCircle)*100.0)*100.0)/100.0;
     System.out.println("Area= " + circleAreaMSqrd + " m^2 " + circleAreaCmSqrd + " cm^2 " + circleAreaMmSqrd + " mm^2 " );
    
     System.out.println("Enter Rectangle Length");
     rectangleLength = sc.nextDouble(); 
     System.out.println("Enter Rectangle Width");
     rectangleWidth = sc.nextDouble();
     areaOfRectangle = rectangleLength*rectangleWidth;
     recAreaMSqrd = ((int)areaOfRectangle)/10000;
     recAreaCmSqrd = ((int)areaOfRectangle)%10000;
     recAreaMmSqrd = Math.round(((areaOfRectangle - (int)areaOfRectangle)*100.0)*100.0)/100.0;
     System.out.println("Area= " + recAreaMSqrd + " m^2 " + recAreaCmSqrd + " cm^2 " + recAreaMmSqrd + " mm^2 ");     

     System.out.println("Enter Triangle Base Length");
     triangleBase = sc.nextDouble();
     System.out.println("Enter Triangle Height");
     triangleHeight = sc.nextDouble();
     areaOfTriangle = (triangleBase*triangleHeight)/2.0;
     triAreaMSqrd = ((int)areaOfTriangle)/10000;
     triAreaCmSqrd = ((int)areaOfTriangle)%10000;
     triAreaMmSqrd = Math.round(((areaOfTriangle - (int)areaOfTriangle)*100.0)*100.0)/100.0;
     System.out.println("Area of Triangle= " + triAreaMSqrd + " m^2 " + triAreaCmSqrd + " cm^2 " + triAreaMmSqrd + " mm^2 " );
  
   }//end main

}// End Class

