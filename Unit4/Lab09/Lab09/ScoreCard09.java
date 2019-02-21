import javax.swing.*;
import java.awt.*;
public class ScoreCard09 extends JPanel
{
    private JTextField[] input;
    public ScoreCard09(){
        setLayout(new GridLayout(2, 18));

        for(int x = 1; x <= 18; x++)
        {
            add(new JLabel("" + x, SwingConstants.CENTER));
        }

        input = new JTextField[18];
        for(int x = 0; x < input.length; x++)
        {
            input[x] = new JTextField();
            add(input[x]);
        }
    }

    public void randomize(){
        for(int x = 0; x < input.length; x++)
        {
            input[x].setText(""+randInt());
        }
    }

    public int findTotal(){
        int total=0;
        for(int x = 0; x < input.length; x++)
            total+=Integer.parseInt(input[x].getText());
        return total;
    }

    public int findAces()
    {
        int total=0;
        for(int x = 0; x < input.length; x++)
            if(Integer.parseInt(input[x].getText())==1)
                total++;
        return total+1;
    }

    public int findHardestHole(){
        int hardestIndex=0;
        int hardest=0;
        for(int x = 0; x < input.length; x++){
            int value = Integer.parseInt(input[x].getText());
            if(value>hardest){
                hardest=value;
                hardestIndex=x;
            }
        }
        return hardestIndex+1;
    }

    public int randInt(){
        return (int) (Math.random()*4)+1;
    }
}