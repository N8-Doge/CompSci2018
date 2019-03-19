import java.io.*;      //the File class
import java.util.*;    //the Scanner class
import javax.swing.JOptionPane;
import java.util.Comparator;
public class Driver07
{
    public static void main(String[] args)
    {
        Salesperson[] array = input("data.txt");
        menu(array);
        System.exit(0);
    }

    public static Salesperson[] input(String filename)
    {    
        Scanner infile = null;
        try{
            infile = new Scanner(new File(filename));
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"The file could not be found.");
            System.exit(0);
        }
        int numitems = infile.nextInt();
        Salesperson[] array = new Salesperson[numitems];
        for(int k = 0; k < numitems; k++)
        {
            array[k]=new Salesperson(infile.next(),infile.nextInt(),infile.nextInt());
        }
        infile.close();
        return array;
    }

    public static void menu(Salesperson[]array)
    {
        int choice = 0;
        while(choice != 7)
        {
            String message = "";
            message = message + "\n1. List Alphabetically.";
            message = message + "\n2. List by Cars Sold.";
            message = message + "\n3. List by Trucks Sold.";
            message = message + "\n4. List by Total Sales.";
            message = message + "\n5. Add Sales.";
            message = message + "\n6. Save data to file.";
            message = message + "\n7. Quit.";
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
                case 1: display(array, new ByName());
                break;
                case 2: display(array, new ByCars());
                break;
                case 3: display(array, new ByTrucks());
                break;
                case 4: display(array, new ByTotalSales());
                break;
                case 5: add(array);
                break;
                case 6: save(array);
                break;
                case 7: 
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

    public static void save(Salesperson[] array)
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
        for(int i=0;i<array.length;++i){
            String s=array[i].getName();
            s+="\n"+Integer.toString(array[i].getCars());
            s+="\n"+Integer.toString(array[i].getTrucks());
            System.out.println(s);
        }
        System.setOut(p);
        System.out.println("Saved.");
    }

    public static void add(Salesperson[] array)
    {
        String message="What salesperson?";
        String choice,answer;
        int index,number;
        while(true){
            String name=JOptionPane.showInputDialog(message);
            if(name!=null){
                index=search(array,name);
                if(index!=-1){
                    break;
                }
            }
        }
        message="Cars or Trucks?";
        while(true){
            choice=JOptionPane.showInputDialog(message);
            if(choice!=null){
                if(choice.equalsIgnoreCase("Cars")|choice.equalsIgnoreCase("Trucks")){
                    break;
                }
            }
        }
        message="How many?";
        while(true){
            answer=JOptionPane.showInputDialog(message);
            if(answer!=null){
                try{
                    number=Integer.parseInt(answer);
                    break;
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Input a valid integer");
                }
            }
        }
        if(choice.equalsIgnoreCase("Cars")){
            array[index].setCars(array[index].getCars()+number);
        }
        else{
            array[index].setTrucks(array[index].getTrucks()+number);
        }
        System.out.println("Sales added.");
    }

    public static int search(Salesperson[] array, String name)
    {
        for(int i=0;i<array.length;++i){
            if(array[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public static void display(Salesperson[] array, Comparator c)
    {
        sort(array, c);
        String tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe="Name";
        tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe = tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe + "\tCars";
        tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe = tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe + "\tTrucks";
        tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe = tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe + "\tTotal";
        tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe = tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe + "\n------------------------------------";
        for(Salesperson s:array){
            tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe = tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe + "\n";
            tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe = tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe + s.toString();
        }
        System.out.println(tHeClEvErWaYtOpRoDuCeThElOnGsTrInGmEsSaGe);
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