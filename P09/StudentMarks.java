import java.util.*;
import java.io.*;

public class StudentMarks
{
    public static void main(String [] args)
    {
        char markPrompt;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an option");
            System.out.println("Display Marks(d)");
            System.out.println("Exit(e)");
       
            markPrompt = sc.nextLine().charAt(0);
            switch(markPrompt)
            {
                case 'd':
                    System.out.println("Enter file name");
                    String fileName = sc.nextLine();
                    int lines = getNumLines(fileName);
                    String [] arrayNames = new String[lines];
                    double [] arrayMarks = new double[lines];
                    readFile(arrayNames, arrayMarks, fileName);
                    break;
                case 'e':
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("Please enter valid options only");
            }//END CASE Statement
        }while (markPrompt != 'e');
    }//END MAIN

    public static int getNumLines(String fileName)
    {
        FileInputStream fileStrm = null;
        InputStreamReader rdr;
        BufferedReader bufRdr;
        int numLines = 0;  
        String line;
        try
        {
            fileStrm = new FileInputStream(fileName);
            rdr = new InputStreamReader(fileStrm);
            bufRdr = new BufferedReader(rdr);

            numLines = 0;
            line = bufRdr.readLine();
            while (line != null)
            {
                numLines = numLines + 1;
                line = bufRdr.readLine();
            }//END WHILE
            fileStrm.close();
        }//END TRY
        catch (IOException e)
        {
            if (fileStrm != null)
            {
                try
                {
                    fileStrm.close();
                }//END TRY
                catch (IOException ex2)
                {
                }//END CATCH
            }//ENDIF
            System.out.println("Error detected");
        }//END TRY
        return numLines;
    }//END getNumlines

    public static void readFile(String [] arrayNames, double [] arrayMarks, String fileName)
    { 
        FileInputStream fileStrm = null;
        InputStreamReader rdr;
        BufferedReader bufRdr;
        int lineNum;
        String line;
        try
        {
            fileStrm = new FileInputStream(fileName);
            rdr = new InputStreamReader(fileStrm);
            bufRdr = new BufferedReader(rdr);

            for(int i=0; i< arrayNames.length; i++)
            {
                line = bufRdr.readLine();
                
                arrayNames[i] = processNames(line);
                arrayMarks[i] = processMarks(line);
            }//ENDFOR
            fileStrm.close();
        }//END try
        catch (IOException e)
        {
            if(fileStrm != null)
            {
                try
                {
                    fileStrm.close();
                }//END try
                catch (IOException ex2)
                {
                }//END catch
            }//ENDIF
        }//END CATCH
    }//END readFile
   
    public static String processNames(String line)
    {
        String [] lineArray = line.split(","); 
        String outputString = lineArray[0];
        return outputString;
    }//END processNames
   
    public static double processMarks(String line)
    {
        String [] lineArray = line.split(",");
        String outputString = lineArray[1];
        double outputReal;
        outputReal = Double.parseDouble(outputString);
        return outputReal;
    }//END processMarks
}//END CLASS






























