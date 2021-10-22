public final class Student
{
    //Class constants 
    public static final double MAXMARK = 100.0;
    public static final double MINMARK = 0.0;

    //Private Class fields
    private String name;
    private double mark;
    
    //CONSTRUCTORS
    //Default Constructor
    public Student()
    {
        name = "Default";
        mark = 0.0;
    }//END SUBMODULE

    //Alternate Constructor
    public Student(String inName, double inMark)
    {
        if (validateMark(inMark))
        {
            name = inName;
            mark = inMark;
        } 
        else
        {
            throw new IllegalArgumentException("Invalid Imports");
        }//ENDIF
    }//END SUBMODULE

    //Copy Constructor
    public Student(Student inStudent)
    {
        name = inStudent.getName();
        mark = inStudent.getMark();
    }
    
    //MUTATORS
    public void setName(String inName)
    {
        name = inName;
    }//END SUBMODULE

    public void setMark(double inMark)
    {
        if (validateMark(inMark))
        {
            mark = inMark;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Imports");
        }//ENDIF
    }//END SUBMODULE

    //ACCESSORS
    public String getName()
    { 
        return name;
    }//END SUBMODULE
    
    public double getMark()
    {
        return mark;
    }//END SUBMODULE

    public boolean equals(String inName, double inMark)
    {
        return (name.equals(inName)) && (mark==inMark);
    }//END SUBMODULE
    
    public boolean equals(Object inObj)
    {
        boolean same = false;
        if (inObj instanceof Student)
        {
            Student inStudent = (Student)inObj;
            same = name.equals(inStudent.getName()) && name.equals(inStudent.getMark());
        }//ENDIF
        return same;
    }//END SUBMODULE
 
    public Object clone()
    {
        Student cloneStudent;
        cloneStudent = new Student(name, mark);
        return cloneStudent;
    }//END SUBMODULE

    public String toString()
    {
        return ("Name: " + name + "Mark: " + mark);
    }

    //PRIVATE SUBMODULES
    private boolean validateMark(double inMark)
    {
        return ((inMark >= MINMARK) && (inMark <= MAXMARK));
    }
}//END CLASS
