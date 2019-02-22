import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 * @Author      Nathan Chen
 * @Version     2-22-19
 * @Teacher     Coglianese
 * @Period      2
 * 
 * Driver04 for Lab04
 */
public class Driver04
{
    //Instance variables
    private static Scanner infile;
    private static String filename;
    private static double sum,avg,max,min;
    private static int numItems,numTries;
    /**
     * Main executes according to Lab04
     * 
     * @param   args    Leave blank
     */
    public static void main(String[] args)
    {
        do{
            try
            {
                filename = JOptionPane.showInputDialog("Enter filename");
                infile = new Scanner( new File(filename) );
                break;
            }
            catch(FileNotFoundException e)
            {
                numTries++;
                if(numTries==3){
                    JOptionPane.showMessageDialog(null, "Error: Tried 3 times.");
                    System.exit(0);
                }
                JOptionPane.showMessageDialog(null, "Error: File not found.");
            }
        }while(true);
        numItems=infile.nextInt();
        boolean init = true;
        while (infile.hasNextDouble()){
            double d = infile.nextDouble();
            sum += d;
            if (d>max){
                max = d;
            }
            if (d<min){
                min = d;
            }
            if (init){
                init=!init;
                max = d;
                min = d;
            }
        }
        avg = sum/numItems;
        System.out.print("Sum: " + sum + "\nAvg: " + avg + "\nMin: " + min + "\nMax: " + max);
    }
}