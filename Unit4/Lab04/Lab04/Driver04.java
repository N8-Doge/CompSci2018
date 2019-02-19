/**
 * @Author      Nathan Chen
 * @Version     2-22-19
 * @Teacher     Coglianese
 * @Period      2
 * 
 * Driver04 for Lab04
 */
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Driver04
{
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
        boolean b = true;
        do{
            try
            {
                filename = JOptionPane.showInputDialog("Enter filename");
                infile = new Scanner( new File(filename) );
                b = false;
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
        }while(b);
        while (infile.hasNextDouble()){
            double d = infile.nextDouble();
            sum += d;
            if (d>max | numItems==0)
                max = d;
            if (d<min | numItems==0)
                min = d;
            numItems++;
        }
        avg = sum/numItems;
        System.out.print("Sum: " + sum + "\nAvg: " + avg + "\nMin: " + min + "\nMax: " + max);
    }
}