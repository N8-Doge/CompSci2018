import java.util.*;

/**
 * Write a description of class BullsEye here.
 * 
 * @author (your name) 
 * 2006 Southern California programming contest
 */
public class BullsEye
{
    public static int calculateShot(Location shot)
    {
        int[] array = {0,500,300,250,200,150,100,75,50,25,10};
        for(int i=0;i<array.length;i++){
            if(ring(shot)==i){
                return array[i];
            }
        }
        return -1;
    }

    public static int calculateScore(ArrayList shots)
    {
        int counter = 0;
        for(int i=0;i<shots.size();i++){
            counter+=calculateShot((Location)shots.get(i));
        }
        return counter;
    }

    public static int ring(Location shot){
        int x=shot.getX();
        int y=shot.getY();
        double radius = 50;
        for(int i=1;i<=10;i++){
            if(radius(x,y)<=radius){
                return i;
            }
            radius+=50;
        }
        return 0;
    }
    
    public static double radius(int x, int y){
        double dx = (double)x;
        double dy = (double)y;
        return Math.sqrt((dx*dx)+(dy*dy));
    }
}