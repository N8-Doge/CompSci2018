import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version 2014 Wittry programming contest
 */
public class StudentVariantSortTest extends junit.framework.TestCase
{
   public void testVariantSort01()
   {
      VariantSort vs = new VariantSort();

      assertEquals(10, vs.returnTheSmaller(7, 10));
      assertEquals(7, vs.returnTheSmaller(7, 14));

      int[] values = {256, 7, 80, 40, 50, 0, 36};
      assertEquals(0, vs.getValueAtIndex(values, 0));
      assertEquals(256, vs.getValueAtIndex(values, 1));
      assertEquals(36, vs.getValueAtIndex(values, 2));
      assertEquals(40, vs.getValueAtIndex(values, 3));
      assertEquals(80, vs.getValueAtIndex(values, 4));
      assertEquals(7, vs.getValueAtIndex(values, 5));
      assertEquals(50, vs.getValueAtIndex(values, 6));
   }
}