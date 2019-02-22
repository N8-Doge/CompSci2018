import javax.swing.*;
import java.awt.*;
public class Scoreboard extends JPanel
{
    private int wins,games,streak,hiscore;
    private JLabel winLabel,streakLabel,hiscoreLabel;
    public Scoreboard()
    {
        setLayout(new GridLayout());
        winLabel = new JLabel("Wins: 0/0 (0.0%)");
        streakLabel = new JLabel("Current Streak: 0");
        hiscoreLabel = new JLabel("Best Streak: 0");
        add(winLabel);
        add(streakLabel);
        add(hiscoreLabel);
    }
    
    public void newGame(boolean b){
        if(b){
            wins++;
            streak++;
        }
        else{
            streak=0;
        }
        games++;
        if(streak>hiscore)
            hiscore=streak;
        update();
    }
    
    public void update(){
        String s = " ("+String.format("%.1f",(double)wins/games*100)+"%)";
        winLabel.setText("Wins: "+wins+"/"+games+s);
        streakLabel.setText("Current Streak: "+streak);
        hiscoreLabel.setText("Best Streak: "+hiscore);
    }
}