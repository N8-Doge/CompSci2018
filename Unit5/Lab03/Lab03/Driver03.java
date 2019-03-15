import java.util.*;
/**
 * Driver03 prints, scrambles, prints, sorts, then prints an array of integers
 * 
 * @author  Nathan Chen
 * @period  2
 * @version 3-15-19
 * @teacher Coglianese
 */
public class Driver03 {
    /**
     * Main executes upon running jar
     * 
     * @param   args    Ignore
     */
    public static void main(String[] args)
    {
        int[] array = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
        print(array);
        scramble(array);
        print(array);
        sort(array);
        print(array);
    }

    /**
     * Prints an array of integers
     * 
     * @param   arr     Array of integers to be printed
     */
    private static void print(int[] arr){
        for(int i:arr){
            System.out.print(Integer.toString(i)+" ");
        }
        System.out.println();
    }

    /**
     * Scrambles an array
     * 
     * @param   arr     Array of integers to be scrambled
     */
    private static void scramble(int[] arr){
        for(int foo:arr){
            for (int i=0; i<arr.length; i++) {
                swap(arr,i,(int)(Math.random()*arr.length));
            }
        }
    }

    /**
     * Sorts an array
     * 
     * @param   arr Array of integers to be sorted
     */
    private static void sort(int[] arr){
        for(int i=arr.length-1;i>0;--i){
            swap(arr,findMax(arr, i),i);
        }
    }

    /**
     * Finds max integer in a section of an array
     * 
     * @return  maximum int in array section
     * @param   arr     Array to search through
     * @param   i       Last index to search through
     */
    private static int findMax(int[] arr, int i){
        int maxIndex=i;
        for(int j=i;j>=0;--j){
            if(arr[maxIndex]<arr[j]){
                maxIndex=j;
            }
        }
        return maxIndex;
    }

    /**
     * Swaps two items in array of integers
     * 
     * @param   arr     Array of ints to be swapped
     * @param   i       First int index
     * @param   j       Second int index
     */
    private static void swap(int[] arr, int i, int j){
        arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
    }
}