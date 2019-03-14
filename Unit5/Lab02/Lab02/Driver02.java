import java.io.*;
import java.util.*;
/**
 * Driver02 sorts an array of doubles from lab00 and outputs to a file using helper methods
 * 
 * @author  Nathan Chen
 * @version 3-14-19
 * @teacher Coglianese
 * @period  2
 */
public class Driver02
{
    /**
     * Main runs upon compiling, sorts array then outputs to file
     * 
     * @param   args    Ignore
     */
    public static void main(String[] args) throws Exception
    {
        double[] array = input("../Lab00/data.txt");
        sort(array);
        output(array, "output.txt");
    }

    /**
     * Gets array of doubles from a file
     * 
     * @param   filename    String for path to file
     */
    public static double[] input(String filename) throws Exception
    {
        Scanner infile = new Scanner(new File(filename));
        double[] myArray = new double[infile.nextInt()];
        for(int i=0;i<myArray.length;++i){
            myArray[i]=infile.nextDouble();
        }
        return myArray;
    }

    /**
     * Sorts an array of doubles
     * 
     * @param   array   Array of doubles to be sorted
     */
    public static void sort(double[] array)
    {
        int maxPos;
        for(int k = 0; k < array.length; k++)
        {
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
        }
    }

    /**
     * Finds the index of the largest in a part of an array
     * 
     * @param   array   Array of doubles to be searched
     * @param   upper   Integer index for end of array to search through
     */
    public static int findMax(double[] array, int upper)
    {
        int maxPos=0;
        for(int i=0;i<upper;++i){
            if(array[maxPos]<array[i]){
                maxPos=i;
            }
        }
        return maxPos;
    }

    /**
     * Swaps two doubles in an array
     * 
     * @param   array   Array of doubles to be swapped
     * @param   a       Integer index of first number to swap
     * @param   b       Integer index of second number to swap
     */
    public static void swap(double[] array, int a, int b)
    {
        double t = array[a];
        array[a]=array[b];
        array[b]=t;
    }

    /**
     * Outputs an array to a file
     * 
     * @param   array   Array of doubles to print out
     * @param   filename    String for path to file to print to
     */
    public static void output(double[] array, String filename) throws Exception
    {
        System.setOut(new PrintStream(new FileOutputStream(filename)));
        for(int k = 0; k < array.length; k++)
            System.out.println(array[k]);
        System.setOut(System.out);
    }
}