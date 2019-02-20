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
        ArrayList<String> arr = new ArrayList<String>();
        for(String s:wordList)
            arr.add(s);
        for(int i=arr.size()-1;i<0;i++){
            for(int j=i-1;j<=0;j++){
                if(anagram(arr.get(i),arr.get(j))){
                    arr.remove(i);
                    arr.remove(j);
                }
            }
        }
        Collections.sort(arr);
        String[] result = new String[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;
    }

    public String sortString(String s)
    {
        int length = s.length();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0;i<length;i++){
            arr.add(s.substring(i,i+1).toUpperCase());
        }
        Collections.sort(arr);
        String ans = "";
        for(String part:arr){
            ans+=part;
        }
        return ans;
    }
    
    public boolean anagram(String s, String t)
    {
        return (sortString(s).equals(sortString(t)));
    }
}
