import java.util.*;
import java.io.*;
/**
 * Driver06 gets Strings from a file, sorts them, then outputs them to another file
 * 
 * @author  Nathan Chen
 * @version 3-21-19
 * @period  2
 * @teacher Coglianese
 */
public class Driver06 {
    /**
     * Main executes upon running the program
     * 
     * @param   args                    Ignore
     * @throw   FileNotFoundException   File may not exist
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner infile = new Scanner(new File("data.txt"));
        int length = infile.nextInt();
        String[] array = new String[length];
        PrintStream p = new PrintStream(System.out);
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        
        for(int i=0;i<length;++i){
            array[i]=infile.nextLine();
        }
        
        for(int i=length-1;i>0;--i){
            int max=i;
            for(int j=i;j>=0;--j){
                if(array[max].compareTo(array[j])<0){
                    max=j;
                }
            }
            String temp=array[max];
            array[max]=array[i];
            array[i]=temp;
        }
        
        for(String s:array){
            System.out.println(s);
        }
        System.setOut(p);
    }
}