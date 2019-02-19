/**
 * @Author      Nathan Chen
 * @Version     2-21-19
 * @Teacher     Coglianese
 * @Period      2
 * 
 * Driver02 for Lab03
 */
import java.util.*;
import java.io.*;
public class Driver03
{
    /**
     * Main executes according to Lab03
     * 
     * @param   args    Leave blank
     */
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("File name:");
        String fileName = keyboard.next();
        Scanner infile = new Scanner( new File(fileName) );
        int numItems = 0;
        while (infile.hasNextLine()){
            numItems ++;
            String foo = infile.next();
        }
        infile = new Scanner( new File(fileName) );
        double[] array = new double[numItems];
        for(int i=0; i<numItems; i++){
            array[i] = infile.nextDouble();
        }
        System.out.println("Fahrenheit\t| Celsius\n----------------|------------------");
        for(double d: array){
            double c = 5.0/9.0*(d-32.0);
            System.out.println(String.format("%.1f",d) + "\t\t| " + String.format("%.1f",c));
        }
    }
}