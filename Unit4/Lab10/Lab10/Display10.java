import javax.swing.*;
import java.util.*;
import java.awt.*;
public class Display10 extends JPanel
{
    private JLabel[] bits;
    private JLabel decimal;
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

    public void randomize(){
        for(int x = 0; x < bits.length; x++){
            bits[x].setText(""+(int)(Math.random()*2));
        }
        convert();
    }

    public void reverse(){
        for(int x = 0; x < bits.length/2; x++){
            String flip = bits[x].getText();
            String flop = bits[bits.length-x-1].getText();
            bits[x].setText(flop);
            bits[bits.length-x-1].setText(flip);
        }
        convert();
    }

    public void shift(){
        for(int x = 0; x < bits.length-1; x++)
            bits[x].setText(bits[x+1].getText());
        bits[bits.length-1].setText("0");
        convert();
    }

    public void rotate(){
        for(int x = bits.length-1; x>0; x--)
            bits[x].setText(bits[x-1].getText());
        bits[0].setText("0");
        convert();
    }
    
    public void convert(){
        int binary = 1;
        int total = 0;
        for(int x = bits.length-1; x>=0; x--){
            if(bits[x].getText().equals("1"))
                total+=binary;
            binary*=2;
        }
        decimal.setText(""+total+".0");
    }
}