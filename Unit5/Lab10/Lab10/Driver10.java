import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class Driver10{
    public static void main(String[] args){
        Song[] songList = input();
        int totalTime = calcTime(songList);
        int longestSong = searchLongestSong(songList);
        display(songList, totalTime, longestSong);
        System.exit(0);
    }

    public static Song[] input(){
        String message = "What file?";
        Scanner infile;
        while (true){
            String file = JOptionPane.showInputDialog(null,message);
            try{
                infile = new Scanner(new File(file));
                break;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e.toString(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        Song[] output = new Song[Integer.parseInt(infile.nextLine())];
        for(int i=0;i<output.length;++i){
            output[i]=new Song(infile.nextLine());
        }
        return output;
    }

    public static int calcTime(Song[] songs){
        int t=0;
        for(Song s:songs){
            t+=s.getSeconds()+s.getMinutes()*60;
        }
        return t;
    }

    public static int searchLongestSong(Comparable[] songs){
        int l=0;
        for(int i=0;i<songs.length;++i){
            if(songs[i].compareTo(songs[l])>0){
                l=i;
            }
        }
        return l;
    }

    public static void display(Song[] array, int total, int longestSong){
        String output = "Total Time: " + Integer.toString(total/60);
        output += "' " + Integer.toString(total%60) + "\"\n";
        output += "Longest Song: " + array[longestSong].toString();
        JOptionPane.showMessageDialog(null,output,"Output",JOptionPane.INFORMATION_MESSAGE);
    }
}