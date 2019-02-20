public class Circle extends Shape
{
    private double myRadius;
    public Circle(double x)
    {
        myRadius = x;
    }

    public double getRadius()
    {
        return myRadius;
    }

    public void setRadius(double x)
    {
        myRadius = x;
    }

    public double findArea()
    {
        return 3.14159*myRadius*myRadius;
    }

    public double findCircumference()
    {
        return 2*3.14159*myRadius;
    }
}