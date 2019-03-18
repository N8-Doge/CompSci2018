import java.io.*;
import java.util.*;
public class Driver04
{
    public static void main(String[] args) throws Exception
    {
        Comparable[] array = input("data.txt");
        sort(array);
        output(array, "output.txt");
    }

    public static Comparable[] input(String filename) throws Exception
    {	
        Scanner infile = new Scanner( new File(filename) );
        int numitems = infile.nextInt();
        Comparable[] array = new Weight[numitems];
        for(int k = 0; k < numitems; k++)
        {
            
        }
        infile.close();
        return array;
    }

    public static void output(Object[]array, String filename) throws Exception
    {
        System.setOut(new PrintStream(new FileOutputStream(filename)));
        for(int k = 0; k < array.length; k++)
            System.out.println(array[k].toString());
    }

    public static void sort(Comparable[] array)
    {
        int maxPos;
        for(int k = 0; k < array.length; k++)
        {
            maxPos = findMax(array, array.length - k);
            swap(array, maxPos, array.length - k - 1);
        }
    }

    public static int findMax(Comparable[] array, int index){return -1;}
    public static void swap(Comparable[] array, int maxPos, int minPos){}

}