import java.io.*;
import java.util.*;
/**
 * Distance isa Comparable allowing comparison of instances
 * 
 * @author  Nathan Chen
 * @version 3-20-19
 * @teacher Coglianese
 * @period  2
 */
public class Distance implements Comparable<Distance>
{ 
    //Class variables
    private int feet,inches;
    
    /**
     * Constructs Distance with 0'0''
     */
    public Distance(){
        feet=inches=0;
    }
    
    /**
     * Constructs Distance according to specified numbers
     * 
     * @param   feet    Integer of feet
     * @param   inches  Integer for inches
     */
    public Distance(int feet, int inches){
        this.feet=feet;
        this.inches=inches;
    }
    
    /**
     * Compares this instance of Distance to another one
     * 
     * @param   d   Distance to compare to
     * @return      Returns positive int when greater, neg if less, 0 if equal
     */
    public int compareTo(Distance d){
        double distance=feet+(inches/12);
        double compare=d.getFeet()+(d.getInches()/12);
        if(distance>compare)
            return 1;
        if(distance<compare)
            return -1;
        return 0;
    }
    
    /**
     * Checks if this instance of Distance is the same as another
     * 
     * @param   d   Distance to compare to
     * @return      Boolean if this instance is the same as d
     */
    public boolean equals(Distance d){
        return compareTo(d)==0;
    }
    
    /**
     * Gets string representation of class
     * 
     * @return  String representation of class
     */
    public String toString(){
        return feet+" ft. "+inches+" in.";
    }
    
    /**
     * Accessor method for feet
     * 
     * @return  Integer of stored feet
     */
    public int getFeet(){
        return feet;
    }
    
    /**
     * Accessor method for feet
     * 
     * @return  Integer of stored inches
     */
    public int getInches(){
        return inches;
    }
    
    /**
     * Accessor method for feet
     * 
     * @param   feet    Integer for stored feet
     */
    public void setFeet(int feet){
        this.feet=feet;
    }
    
    /**
     * Accessor method for feet
     * 
     * @param   inches  Integer for stored inches
     */
    public void setInches(int inches){
        this.inches=inches;
    }
    
    /*
     * We can use this.[var] to simplify code. 
     * This is in accordance with style guides
     */
}
