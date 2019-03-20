import java.io.*;
import java.util.*;
public class Distance implements Comparable<Distance>
{ 
    private int feet,inches;
    public Distance(){
        feet=inches=0;
    }
    
    public Distance(int feet, int inches){
        this.feet=feet;
        this.inches=inches;
    }
    
    public int compareTo(Distance d){
        double distance=feet+(inches/12);
        double compare=d.getFeet()+(d.getInches()/12);
        if(distance>compare)
            return 1;
        if(distance<compare)
            return -1;
        return 0;
    }
    
    public boolean equals(Distance d){
        return compareTo(d)==0;
    }
    
    public String toString(){
        return feet+" ft. "+inches+" in.";
    }
    
    public int getFeet(){return feet;}
    public int getInches(){return inches;}
    public void setFeet(int feet){this.feet=feet;}
    public void setInches(int inches){this.inches=inches;}
}
