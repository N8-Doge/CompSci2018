import javax.swing.*;
import java.awt.*;
/**
 * Class Display is a display of binary that changes according to values called
 * 
 * @author      Nathan Chen
 * @teacher     Coglianese
 * @period      2
 * @version     3-6-19
 */
public class Display11 extends JPanel
{
    //Instance variables
    private JLabel[] output;
    private int[] bits;
    
    /**
     * Default constructor, makes a JPanel of labels
     */
    public Display11(){
        setLayout(new GridLayout(1, 8));

        output = new JLabel[8];
        bits = new int[8];
        for(int x = 0; x <= 7; x++)
        {
            output[x] = new JLabel("", SwingConstants.CENTER);
            output[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(output[x]);
        }
        setBlank();
    }

    /**
     * Sets the JLabels of the panel to "-"
     */
    public void setBlank(){    
        for(int x = 0; x <= 7; x++){
            output[x].setText("-");
        }
    }

    /**
     * Sets the JLabels of the panel to the binary representation of an integer
     * 
     * @param   num     Integer to convert to binary
     */
    public void setValue( int num ){
        int foo = num;
        int binary = 1;
        for(int x = 7; x >= 0; x--){
            binary*=2;
            if(foo%binary!=0){
                output[x].setText("1");
            }
            else{
                output[x].setText("0");
            }
            foo=foo-(foo%binary);
        }
    }
}