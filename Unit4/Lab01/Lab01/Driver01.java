/**
 * @Author      Nathan Chen
 * @Version     2-19-19
 * @Teacher     Coglianese
 * @Period      2
 * 
 * Driver01 for Lab01
 */
import java.util.Scanner;
public class Driver01
{
    public static final int NUMITEMS = 10;
    private static double sum, avg, min, max;
    /**
     * Main executes according to Lab01
     * 
     * @param   args    Leave blank
     */
    public static void main(String[] args)
    {
        double[] array = new double[NUMITEMS];
        Scanner keyboard = new Scanner(System.in);
        for(int x = 0; x < NUMITEMS; x++)
        {
            System.out.print("#" + (x+1) + ": ");
            array[x] = keyboard.nextDouble();
        }
        min = array[0];
        max = array[0];
        for(double d:array){
            sum += d;
            if (d>max)
                max = d;
            if (d<min)
                min = d;
        }
        avg = sum/NUMITEMS;
        System.out.println("\nSum: " + sum + "\nAvg: " + avg + "\nMin: " + min + "\nMax: " + max);
    }
}