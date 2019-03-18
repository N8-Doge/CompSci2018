import java.io.*;
import java.util.*;
public class Weight implements Comparable<Weight>
{ 
    private int pounds,ounces;
    public Weight(){
        pounds=ounces=0;
    }
    
    public Weight(int pounds, int ounces){
        this.pounds=pounds;
        this.ounces=ounces;
    }
    
    public int compareTo(Weight w){
        double weight=pounds+(ounces*0.0625);
        double compare=w.getPounds()+(w.getOunces()*0.0625);
        if(weight>compare)
            return 1;
        if(weight<compare)
            return -1;
        return 0;
    }
    
    public String toString(){
        return pounds+" lbs. "+ounces+" oz.";
    }
    
    public int getPounds(){return pounds;}
    public int getOunces(){return ounces;}
    public void setPounds(int pounds){this.pounds=pounds;}
    public void setOunces(int ounces){this.ounces=ounces;}
}
