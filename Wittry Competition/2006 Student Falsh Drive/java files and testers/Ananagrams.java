import java.util.*;
/**
 * Write a description of class Ananagrams here.
 * 
 * @author (your name) 
 * 2006 Southern California programming contest
 */
public class Ananagrams
{
    private String[] wordList;

    /**
     * Constructor need for Ananagrams class
     */
    public Ananagrams(String[] list)
    {
        wordList = list;
    }

    public String[] getResult()
    {
        ArrayList<String> uniqueDict = new ArrayList<String>();
        for(int i=0;i<wordList.length;i++){
            if(check(wordList[i],wordList)){
                uniqueDict.add(wordList[i]);
            }
        }
        Collections.sort(uniqueDict);
        String[] result = new String[uniqueDict.size()];
        for(int i=0;i<result.length;i++){
            result[i]=uniqueDict.get(i);
        }
        return result;
    }

    public String sortString(String s)
    {
        String ans = "";
        int length = s.length();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0;i<length;i++){
            arr.add(s.substring(i,i+1).toUpperCase());
        }
        Collections.sort(arr);
        for(String part:arr){
            ans+=part;
        }
        return ans;
    }

    public boolean check(String s, String[] arr)
    {
        int i=0;
        for(String a:arr){
            if(sortString(s).equals(sortString(a))){
                i++;
            }
        }
        return i==1;
    }
}
