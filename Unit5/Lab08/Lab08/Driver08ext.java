import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Comparator;
public class Driver08ext
{
    public static void main(String[] args)
    {
        EMail[] array = input("data.txt");
        menu(array);
        System.exit(0);
    }

    public static EMail[] input(String fileuserName)
    {    
        Scanner infile = null;
        try{
            infile = new Scanner(new File(fileuserName));
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"The file could not be found.");
            System.exit(0);
        }
        int numitems = infile.nextInt();
        EMail[] array = new EMail[numitems];
        for(int k = 0; k < numitems; k++)
        {
            array[k]=new EMail(infile.next());
        }
        infile.close();
        return array;
    }

    public static void menu(EMail[]array)
    {
        int choice = 0;
        while(choice != 7)
        {
            String message = "";
            message = message + "\n1. List by User Name.";
            message = message + "\n2. List by Host Name.";
            message = message + "\n3. List by Extension.";
            message = message + "\n4. Add EMail.";
            message = message + "\n5. Save data to file.";
            message = message + "\n6. Quit.";
            String s=JOptionPane.showInputDialog(message);
            if(s==null){
                choice=7;
            }
            else{
                try{
                    choice=Integer.parseInt(s);
                }
                catch(Exception e){
                    choice=-1;
                }
            }
            switch(choice)
            {
                case 1: display(array, new ByUserName());
                break;
                case 2: display(array, new ByHostName());
                break;
                case 3: display(array, new ByExtension());
                break;
                case 4: add(array);
                break;
                case 5: save(array);
                break;
                case 6: 
                for(int k = 0; k < 25; k++){ 
                    System.out.println();
                }
                System.out.println("Bye-bye!");
                break;
                default: System.out.println("Not a valid selection.");
                break;
            }
            System.out.println();
        }
    }

    public static void save(EMail[] array)
    {
        PrintStream p=new PrintStream(System.out);
        PrintStream outfile = null;
        try{
            System.setOut(new PrintStream(new FileOutputStream("data.txt")));
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"The file could not be created.");
        }
        System.out.println(Integer.toString(array.length));
        for(EMail e:array){
            System.out.println(e.toString());
        }
        System.setOut(p);
        System.out.println("Saved.");
    }

    public static void add(EMail[] array)
    {
        String message="What EMail?";
        String email;
        while(true){
            email = JOptionPane.showInputDialog(message);
            if(email!=null){
                if(email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$"))
                {
                    break;
                }
            }
            System.out.println("Enter a valid email");
        }
        EMail[] temp = new EMail[array.length+1];
        for(int i=0;i<array.length;++i){
            temp[i]=array[i];
        }
        temp[array.length]=new EMail(message);
        System.out.println("Sales added.");
    }

    public static int search(EMail[] array, String userName)
    {
        for(int i=0;i<array.length;++i){
            if(array[i].getUserName().equals(userName)){
                return i;
            }
        }
        return -1;
    }

    public static void display(EMail[] array, Comparator c)
    {
        sort(array, c);
        String message="Emails:";
        for(EMail s:array){
            message = message + "\n";
            message = message + s.toString();
        }
        System.out.println(message);
    }

    public static void sort(Object[] array, Comparator c)
    {
        int minPos;
        for(int k = 0; k < array.length; k++)
        {
            minPos = findMin(array, array.length - k, c);
            swap(array, minPos, array.length - k - 1);
        }
    }

    public static int findMin(Object[] array, int upper, Comparator c)
    {
        int temp=upper-1;
        for(int i=0;i<upper;++i){
            if(c.compare(array[temp],array[i])>0){
                temp=i;
            }
        }
        return temp;
    }

    public static void swap(Object[] array, int a, int b)
    {
        Object temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}