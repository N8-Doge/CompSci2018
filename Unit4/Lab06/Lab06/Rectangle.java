import java.util.*;
/**
 * @author      Nathan Chen
 * @author      Benjamin Tu
 * @teacher     Coglianese
 * @version     2-27-18
 * @period      2
 * 
 * Class Rectangle creates a rectangle object
 * that inherits methods from <abstract> Shape
 */
public class Rectangle extends Shape
{
    //Instance variables
    private double myBase;
    private double myHeight;
    
    /**
     * Create a rectangle with base and height
     * 
     * @param   x   Double for base
     * @param   y   Double for height
     */
    public Rectangle(double x, double y){
        myBase=x;
        myHeight=y;
    }
    
    /**
     * Returns area of rectangle as Double
     */
    public double findArea(){
        return myBase*myHeight;
    }
    
    /**
     * Returns diagonal of rectangle as Double
     */
    public double findDiagonal(){
        return Math.sqrt(myBase*myBase+myHeight*myHeight);
    }
    
    /**
     * Returns perimeter of rectangle as Double
     */
    public double findPerimeter(){
        return 2.0*(myBase+myHeight);
    }
    
    /**
     * Returns base of rectangle as Double
     */
    public double getBase(){
        return myBase;
    }
    
    /**
     * Returns height of rectangle as Double
     */
    public double getHeight(){
        return myHeight;
    }
    
    /**
     * Sets base of rectangle
     * 
     * @param   x   Double for base
     */
    public void setBase(double x){
        myBase = x;
    }
    
    /**
     * Sets height of rectangle
     * 
     * @param   x   Double for height
     */
    public void setHeight(double x){
        myHeight = x;
    }
}