import java.util.*;
public class Driver04Test extends junit.framework.TestCase
{
    public void testDriver04(){
        Comparable[] array = {new Weight(3,4), new Weight(3,4), new Weight(2,3), new Weight(1,2)};
        Comparable[] answer = {new Weight(1,2),new Weight(2,3), new Weight(3,4), new Weight(3,4)};
        
        Driver04 d = new Driver04();
        d.sort(array);
        
        for(int i=0;i<array.length;++i)
            assertEquals("compareTo failed at:", array[i].compareTo(answer[i]), 0);
    }
}
