import javax.swing.*;
import java.awt.*;
public class Display11 extends JPanel
{
    private JLabel[] output;
    private int[] bits;
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

    public void setBlank(){    
        for(int x = 0; x <= 7; x++)
            output[x].setText("-");
    }

    public void setValue( int num ){
        int foo = num;
        int binary = 1;
        for(int x = 7; x >= 0; x--){
            binary*=2;
            if(foo%binary!=0)
                output[x].setText("1");
            else
                output[x].setText("0");
            foo=foo-(foo%binary);
        }
    }
}