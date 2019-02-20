import java.util.*;
public class Rectangle extends Shape
{
    private double myBase;
    private double myHeight;
    public Rectangle(double x, double y){
        myBase=x;
        myHeight=y;
    }
    
    public double findArea(){
        return myBase*myHeight;
    }
    
    public double findDiagonal(){
        return Math.sqrt(myBase*myBase+myHeight*myHeight);
    }
    
    public double findPerimeter(){
        return 2.0*(myBase+myHeight);
    }
    
    public double getBase(){
        return myBase;
    }
    
    public double getHeight(){
        return myHeight;
    }
    
    public void setBase(double x){
        myBase = x;
    }
    
    public void setHeight(double x){
        myHeight = x;
    }
}