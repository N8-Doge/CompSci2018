/**
 * The test class Sorter03Test.
 *
 * @author  Nathan Chen
 * @version 3-18-19
 */
public class Sorter03Test extends junit.framework.TestCase
{
    /**
     * Test class Sorter03
     */
    public void testSorter03()
    {
        int[] answer = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
        int[] bubble = {101, 100, 103, 102, 105, 104, 106, 109, 107, 108};
        
        Sorter03 s = new Sorter03();
        s.bubbleSort(bubble);
        printArray("Answer:", answer);
        printArray("Bubble Sort:", bubble);
        for(int i=0;i<answer.length;++i)
            assertEquals("Fail Bubble Test", answer[i],bubble[i]);
            
        int[] insert = {101, 100, 103, 102, 105, 104, 106, 109, 107, 108};
        s.insertionSort(insert);
        printArray("Insert Sort:", insert);
        for(int i=0;i<answer.length;++i)
            assertEquals("Fail Insertion Test", answer[i],insert[i]);
    }
    
    private void printArray(String s, int[] array){
        System.out.print(s);
        for(int i:array)
            System.out.print(" "+Integer.toString(i));
        System.out.println();
    }
}
