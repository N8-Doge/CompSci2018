import java.io.*;
import java.util.*;
/**
 * Driver00 calculates the min and max numbers in data.txt
 * 
 * @author  Nathan Chen
 * @version 3-12-19
 * @teacher Coglianese
 * @period  2
 */
public class Driver00
{
    /**
     * Main runs upon the execution of the program
     * 
     * @param   args    Array of strings from terminal execution
     */
    public static void main(String[] args) throws Exception
    {
        Scanner infile = new Scanner(new File("data.txt"));
        int numitems = infile.nextInt();
        double[] array = new double[numitems];
        for(int k = 0; k < numitems; k++)
            array[k] = infile.nextDouble();
        infile.close();
        int minPos, maxPos;
        minPos = findMin(array);
        maxPos = findMax(array);
        System.out.println("Minimum value: " + minPos);
        System.out.println("Maximum value: " + maxPos);
    }

    /**
     * Finds the position of the smallest double in an array
     * 
     * @param   apple   Array of doubles to search through
     */
    private static int findMin(double[] apple)
    {
        double min=apple[0];
        int minPos=0;
        for(int i=0;i<apple.length;++i){
            if(min>apple[i]){
                min=apple[i];
                minPos=i;
            }
        }
        return minPos;
    }

    /**
     * Finds the position of the largest double in an array
     * 
     * @param   banana  Array of doubles to search through
     */
    private static int findMax(double[] banana)
    {
        double max=banana[0];
        int maxPos=0;
        for(int i=0;i<banana.length;++i){
            if(max<banana[i]){
                max=banana[i];
                maxPos=i;
            }
        }
        return maxPos;
    }
}