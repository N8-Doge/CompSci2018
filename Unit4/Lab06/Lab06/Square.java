/**
 * @author      Nathan Chen
 * @author      Benjamin Tu
 * @teacher     Coglianese
 * @version     2-27-18
 * @period      2
 * 
 * Class Square is a rectangle that has simplified methods
 */
public class Square extends Rectangle
{
    /**
     * Constructs a new Square
     * 
     * @param   x   Double for side
     */
    public Square(double x){
        super(x,x);
    }
    
    /**
     * Returns side as a Double
     */
    public double getSide(){
        return getBase();
    }
    
    /**
     * Sets side of square
     * 
     * @param   x   Double for side
     */
    public void setSide(double x){
        setBase(x);
        setHeight(x);
    }
}
