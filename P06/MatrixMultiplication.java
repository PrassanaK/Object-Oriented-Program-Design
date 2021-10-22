import java.io.*;

public class MatrixMultiplication
{
    public static void main(String [] args)
    {
        int [][] matrixA;
        int [][] matrixB;
        int [][] matrixC;

        String fileOne = ArrayReader.getFileName("Enter filename one");
        String fileTwo = ArrayReader.getFileName("Enter filename two");
 
        matrixA = ArrayReader.readArray(fileOne);
        matrixB = ArrayReader.readArray(fileTwo);

        if (matrixA == null || matrixB == null)
        {
            System.out.println("Invalid input files");
        }
        else
        {
            matrixC = multiplyArrays(matrixA, matrixB);
            
            printArray(matrixC);
        }
    }//end main

    public static int[][] multiplyArrays(int[][] matrixA, int[][] matrixB)
    {
        int [][] matrixC = new int[matrixA.length][matrixB[0].length];
   
        for (int ii = 0; ii < matrixA.length; ii++)
        {
            for (int jj = 0; jj < matrixB[0].length; jj++)
            {
                for (int kk = 0; kk < matrixA[0].length; kk++)
                {
                    matrixC[ii][jj] += matrixA[ii][kk] * matrixB[kk][jj];
                }
            }
        }
        return matrixC;
    }//end multiplyArrays
  
    public static void printArray(int[][] inArray)
    {
        for (int ii = 0; ii < inArray.length; ii++)
        { 
            for (int jj = 0; jj < inArray[ii].length; jj++)
            {  
                System.out.print(inArray[ii][jj]);
            }
        }
    }
}
    
    
