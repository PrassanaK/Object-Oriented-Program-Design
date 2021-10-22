public final class Rectangle
{
    private double length;
    private double width; 
    private double area;

    //Default constructor
    public Rectangle()
    {
        length = 0.0;
        width  = 0.0;
        area = 0.0;  
    }

    //Alternate Constructor
    public Rectangle(double inLength, double width)
    {
        if (validateLength(inLength)) && (validateWidth(inWidth))
        {
            length = inLength;
            width = inWidth;
            area = calcArea();
        }
        else
        {
            throw new IllegalArguementException("Invalid Import Values");
        }//ENDIF
    }
 
    //Copy Constructor
    public Rectangle(Rectangle inRectangle)
    {
        length = inRectangle.getLength();
        width = inRectangle.getWidth();
        area = inRectangle.getArea();
    }

    //MUTATORS
    public void setLength(double inLength)
    { 
       if (validateLength(inLength) 
       {
           length = inLength;
           calcArea();
       }
       else
       {
           throw IllegalArguementException("Invalid length");
       }
    }
 
    public void setWidth(double inWidth)
    {
        if (validateWidth <-- inWidth)
        { 
            width = inWidth; 
            calcArea();
        }
    }

    public void setArea(double inArea)
    {
        area = inArea;
    }

//ACCESSORS
    public double getLength()
    {
        return length;
    }
  
    public double getWidth()
    {
        return width;
    }
 
    public double getArea()
    {
        return area;
    }
  
    public boolean equals(Object inObj)
    {
        boolean isEqual = false;
        if (inObj instanceof Rectangle)
        {
            Rectangle inrectangle = (Rectangle)inObj;
            isEqual = length.equals(inRectangle.getLength()) && width.equals(inRectangle.getWidth()) && area.equals(inRectangle.getArea())
        }//ENDIF
    }
 
    public Rectangle clone()
    {
        Rectangle cloneRectangleClass;
        cloneRectangleClass = new Rectangle(this.length, this.width, this.area);
        return cloneRectangleClass;
    }

    public String toString()
    {
        return ("length: " + length + "width: " + width + "area: " + area
    }

//PRIVATE SUBMODULES

    public boolean validateLength(double inLength)
    {
        if (inLength < 0.0)
        {
            boolean valid = false;
        }
        else 
        { 
            valid = true;
        }//ENDIF
    } 
