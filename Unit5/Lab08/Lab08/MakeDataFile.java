import java.io.*;
/**
 * Outputs random emails
 * 
 * @author  Nathan Chen
 * @teacher Coglianese
 * @version 3-20-19
 * @period  2
 */
public class MakeDataFile
{
    /**
     * Main executes upon run
     * 
     * @param   args    Ignore
     */
    public static void main(String[] args) throws Exception
    {
        PrintStream p = new PrintStream(System.out);
        System.setOut(new PrintStream(new FileOutputStream("data.txt")));
        String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        chars+="abcdefghijklmnopqrstuvwxyz";
        chars+="0123456789";
        String extension = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        extension += "abcdefghijklmnopqrstuvwxyz";
        int totalEmails=(int)(Math.random()*100+10);
        System.out.println(totalEmails);
        for(int i=0;i<totalEmails;++i){
            int namelen=(int)(Math.random()*10+4);
            int domain=(int)(Math.random()*5+3);
            int ext=(int)(Math.random()*2+3);
            String email="";
            for(int j=0;j<namelen;++j){
                int index=(int)(Math.random()*chars.length());
                email+=chars.substring(index,index+1);
            }
            email+="@";
            for(int j=0;j<domain;++j){
                int index=(int)(Math.random()*chars.length());
                email+=chars.substring(index,index+1);
            }
            email+=".";
            for(int j=0;j<ext;++j){
                int index=(int)(Math.random()*extension.length());
                email+=extension.substring(index,index+1);
            }
            System.out.println(email);
        }
        System.setOut(p);
    }
}