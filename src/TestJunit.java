import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
   @Test
   public void testAdd() {
      FindMax test = new FindMax();
      int output = test.findmax(new int[]{1,3,4,2});
      assertEquals(4,output);
   }
}
