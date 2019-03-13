import java.io.*;
import java.util.*;
/**
 * Driver01 completes Lab01 by sorting arrays
 * 
 * @author  Nathan Chen
 * @version 3-13-19
 * @teacher Coglianese
 * @period  2
 */
public class Driver01
{
    /**
     * Main runs the Lab01 by sorting an array of doubles gathered from Lab00
     * 
     * @param   args    Ignore
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        //input (Windows can interpret / as \, allowing us to ignore OS differences)
        Scanner infile = new Scanner(new File("../Lab00/data.txt"));
        double[] myArray = new double[infile.nextInt()];
        for(int i=0;i<myArray.length;++i){
            myArray[i]=infile.nextDouble();
        }
        //sort the array
        int maxIndex;
        double temp;
        for(int i=myArray.length-1;i>0;--i){
            maxIndex=i;
            for(int j=i;j>=0;--j){
                if(myArray[maxIndex]<myArray[j]){
                    maxIndex=j;
                }
            }
            temp=myArray[maxIndex];
            myArray[maxIndex]=myArray[i];
            myArray[i]=temp;
        }
        //output
        for(double d:myArray){
            System.out.println(""+d);
        }
    }
}