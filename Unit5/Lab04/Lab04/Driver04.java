import java.io.*;
import java.util.*;
public class Driver04
{
    public static void main(String[] args) throws Exception
    {
        Comparable[] array = input("data.txt");
        print("Input: ",array);
        sort(array);
        print("Output: ",array);
        output(array, "output.txt");
    }

    public static Comparable[] input(String filename) throws Exception
    {   
        Scanner infile = new Scanner( new File(filename) );
        int numitems = infile.nextInt();
        Comparable[] array = new Weight[numitems];
        for(int k = 0; k < numitems; k++)
        {
            array[k]=new Weight(infile.nextInt(),infile.nextInt());
        }
        infile.close();
        return array;
    }

    public static void output(Object[]array, String filename) throws Exception
    {
        PrintStream s = new PrintStream(System.out);
        System.setOut(new PrintStream(new FileOutputStream(filename)));
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k].toString());
        }
        System.setOut(s);
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

    public static int findMax(Comparable[] array, int index){
        int temp = 0;
        for(int i=0;i<index;++i){
            if(array[temp].compareTo(array[i])==-1){
                temp=i;
            }
        }
        return temp;
    }
    public static void swap(Comparable[] array, int maxPos, int minPos){
        Comparable temp = array[maxPos];
        array[maxPos]=array[minPos];
        array[minPos]=temp;
    }
    public static void print(String s, Comparable[] array){
        System.out.println(s);
        for(Comparable c: array){
            System.out.println(c.toString());
        }
        System.out.println();
    }
}