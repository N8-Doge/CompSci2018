import java.util.*;
/**
 * @author      Nathan Chen
 * @author      Benjamin Tu
 * @teacher     Coglianese
 * @version     2-27-18
 * @period      2
 * 
 * Class Triangle extends <abstract> Shape to
 * create an equliateral Triangle shape 
 */
public class Triangle extends Shape
{
    //Instance variables
    private double mySide;
    
    /**
     * Constructs a new Triangle
     * 
     * @param   x   Double for side
     */
    public Triangle(double x)
    {
        mySide = x;
    }
    
    /**
     * Returns double of triangle's area
     */
    public double findArea(){
        return Math.sqrt(3)/4*mySide*mySide;
    }
    
    /**
     * Returns double of triangle's perimeter
     */
    public double findPerimeter(){
        return 3*mySide;
    }
    
    /**
     * Returns double of triangle's side
     */
    public double getSide(){
        return mySide;
    }
    
    /**
     * Sets triangle's side
     * 
     * @param   x   Double for side
     */
    public void setSide(double x){
        mySide = x;
    }
}
