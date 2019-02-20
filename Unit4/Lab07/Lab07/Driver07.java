import java.io.*;
import java.util.*;
public class Driver07
{
    public static void main(String[] args) throws Exception{ 
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        Shape[] shapes = new Shape[100];
        for(int i=0; i<100; i++){
            int type = (int) (Math.random()*4);
            double rand = Math.random()*10.0 + 1.0;
            double randA = Math.random()*10.0 + 1.0;
            switch(type){
                case 0:
                    shapes[i] = new Circle(rand);
                    break;
                case 1:
                    shapes[i] = new Rectangle(rand,randA);
                    break;
                case 2:
                    shapes[i] = new Square(rand);
                    break;
                case 3:
                    shapes[i] = new Triangle(rand);
                    break;
            }
        }
        System.out.println("Shapes\n------");
        for (int i=0; i<100; i++){
            System.out.print("area = " + String.format("%.4f",shapes[i].findArea()));
            System.out.println("\t" + shapes[i].toString());
        }
    }
}
