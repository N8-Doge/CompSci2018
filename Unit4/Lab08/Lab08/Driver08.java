import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
/**
 * Driver08 is dictionary lab
 * 
 * @author      Nathan Chen
 * @version     2-28-19
 * @period      2
 * @teacher     Coglianese
 */
public class Driver08
{
    //Instance variables
    private static Scanner infile;    
    
    /**
     * Main executes when program starts
     * 
     * @param   args    Ignore
     */
    public static void main(String[] args){
        try{
            infile = new Scanner(new File("words.txt"));
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Couldn't find words.txt");
        }
        int numItems = infile.nextInt();
        String[] wordlist = new String[numItems];
        for(int i=0; i<numItems; i++){
            wordlist[i]=infile.next();
        }
        while(true){
            String myWord = JOptionPane.showInputDialog("Word? (Type –1 to quit:)");
            if(myWord==null){
                break;
            }
            if(myWord.equals("-1")){
                break;
            }
            int check=-1;
            for(int i=0;i<numItems;i++){
                if(myWord.equalsIgnoreCase(wordlist[i])){
                    check=i;
                    break;
                }
            }
            if(check!=-1){
                System.out.println("Yes, \""+myWord+"\" is a word,#"+check);
            }
            else{
                System.out.println("No, \""+myWord+"\" is not a word");
            }
        }
    }
}