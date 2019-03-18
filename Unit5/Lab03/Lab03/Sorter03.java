/**
 * Sorter03 is used to sort arrays from Driver03
 * 
 * @author  Nathan Chen
 * @version 3-18-19
 * @period  2
 * @teacher Coglianese
 */
public class Sorter03{
    /**
     * Sorts array given with bubble sort algorithm
     * 
     * @param   array   Array of ints to sort
     */
    public static void bubbleSort(int[] array){
        boolean b=true;
        while(b){
            b=false;
            for(int i=0;i<array.length-1;++i){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                    b=true;
                }
            }
        }
    }

    /**
     * Sorts array given with insertion sort algorithm
     * 
     * @param   array   Array of ints to sort
     */
    public static void insertionSort(int[] array){
        for(int i=1;i<array.length;++i){
            int temp=array[i];
            int j=i-1;
            while(j>=0&&array[j]>temp){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=temp;
        }
    }

    /**
     * Swaps two elements in an array
     * 
     * @param   array   Array of ints to swap
     * @param   a       First integer index
     * @param   b       Second integer index
     */
    public static void swap(int[] array, int a, int b){
        array[a]=(array[a]+array[b])-(array[b]=array[a]);
    }
    
    /**
     * Shifts an element down an array
     * 
     * @param   array   Array of ints to shift
     * @param   a       Integer index of shifting element
     * @param   b       Integer index of final resting place
     */
    public static void shift(int[] array, int a, int b){
        int temp=array[a];
        for(int i=a;i>b;--i){
            array[i]=array[i-1];
        }
        array[b]=temp;
    }
}