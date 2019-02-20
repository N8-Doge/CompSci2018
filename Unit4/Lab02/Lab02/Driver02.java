/**
 * @Author      Nathan Chen
 * @Version     2-20-19
 * @Teacher     Coglianese
 * @Period      2
 * 
 * Driver02 for Lab02
 */
import java.util.Scanner;
import java.lang.Math;
public class Driver02
{
    public static final int NUMITEMS = 15;
    private static double sum, avg, min, max;
    /**
     * Main executes according to Lab02
     * 
     * @param   args    Leave blank
     */
    public static void main(String[] args)
    {
        double[] array = new double[NUMITEMS];
        double[] cel = new double[NUMITEMS];
        Scanner keyboard = new Scanner(System.in);
        for(int x = 0; x < 10; x++){
            System.out.print("#" + (x+1) + ": ");
            array[x] = keyboard.nextDouble();
        }
        for(int x = 10; x < NUMITEMS; x++){
            array[x] = Math.random() * 999.9;
        }
        System.out.println("\nFahrenheit\t| Celsius\n----------------|------------------");
        for(int x = 0; x<NUMITEMS; x++){
            cel[x] = 5.0/9.0*(array[x]-32.0);
            System.out.println(String.format("%.1f",array[x]) + "\t\t| " + String.format("%.1f",cel[x]));
        }
    }
}