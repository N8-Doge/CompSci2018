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
        for(int i=0;i<length;++i){
            array[i]=infile.nextLine();
        }
        
        boolean b=true;
        while(b){
            b=false;
            for(int i=0;i<length-1;++i){
                if(array[i].compareTo(array[i+1])>0){
                    String temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    b=true;
                }
            }
        }
        
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        for(String s:array){
            System.out.println(s);
        }
    }
}