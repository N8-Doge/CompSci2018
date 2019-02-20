import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Driver08
{
    private static Scanner infile;    
    public static void main(String[] args){
        try{
            infile = new Scanner(new File("words.txt"));
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Couldn't find words.txt");
        }
        int numItems = infile.nextInt();
        String[] wordlist = new String[numItems];
        for(int i=0; i<numItems; i++)
            wordlist[i]=infile.next();
        while(true){
            String myWord = JOptionPane.showInputDialog("Word? (Type –1 to quit:)");
            if(myWord==null)
                break;
            if(myWord.equals("-1"))
                break;
            int check=-1;
            for(int i=0;i<numItems;i++){
                if(myWord.equals(wordlist[i])){
                    check=i;
                }
            }
            if(check!=-1)
                System.out.println("Yes, \""+myWord+"\" is a word,#"+check);
            else
                System.out.println("No, \""+myWord+"\" is not a word");
        }
    }
}