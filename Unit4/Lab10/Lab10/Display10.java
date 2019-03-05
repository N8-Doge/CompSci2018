import javax.swing.*;
import java.util.*;
import java.awt.*;
/**
 * Display10 is embedded in Panel10 to execute Lab10
 * 
 * @author      Nathan Chen
 * @teacher     Coglianese
 * @period      2
 * @version     3-5-19
 */
public class Display10 extends JPanel
{
    //Instance Variables
    private JLabel[] bits;
    private JLabel decimal;
    /**
     * Default constructor
     */
    public Display10(){
        setLayout(new GridLayout(1, 9));
        bits = new JLabel[8];
        for(int x = 0; x < bits.length; x++){
            bits[x] = new JLabel("", SwingConstants.CENTER);
            bits[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(bits[x]);
        }
        decimal = new JLabel("",SwingConstants.CENTER);
        decimal.setFont(new Font("Serif", Font.BOLD,14));
        add(decimal);
        randomize();
    }

    /**
     * Randomizes the bits
     */
    public void randomize(){
        for(int x = 0; x < bits.length; x++){
            bits[x].setText(""+(int)(Math.random()*2));
        }
        convert();
    }

    /**
     * Swaps the left and right bits
     */
    public void reverse(){
        for(int x = 0; x < bits.length/2; x++){
            String flip = bits[x].getText();
            String flop = bits[bits.length-x-1].getText();
            bits[x].setText(flop);
            bits[bits.length-x-1].setText(flip);
        }
        convert();
    }

    /**
     * Shift the numbers to the left
     */
    public void shift(){
        for(int x = 0; x < bits.length-1; x++){
            bits[x].setText(bits[x+1].getText());
        }
        bits[bits.length-1].setText("0");
        convert();
    }

    /**
     * Rotates the numbers to the left, 
     * Moves left most bit to rightmost bit
     */
    public void rotate(){
        boolean b = false;
        if (bits[0].getText().equals("1")){
            b=true;
        }
        for(int x = 0; x < bits.length-1; x++){
            bits[x].setText(bits[x+1].getText());
        }
        if (b){
            bits[bits.length-1].setText("1");
        }
        else{
            bits[bits.length-1].setText("0");
        }
        convert();
    }
    
    /**
     * Converts binary number to decimal, 
     * then displays it on the label
     */
    public void convert(){
        int[] arr = new int[bits.length];
        for(int i=0;i<arr.length;i++){
            arr[arr.length-1-i]=(int)Math.pow(2,i);
        }
        int total = 0;
        for(int x = 0; x < bits.length; x++){
            if(bits[x].getText().equals("1")){
                total+=arr[x];
            }
        }
        decimal.setText(""+total+".0");
    }
}