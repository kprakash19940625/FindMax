import static org.junit.Assert.*;

import org.junit.Test;

public class Testlogic {
        @Test
        public  void test() {
                FindMax test = new FindMax();
                int output = test.findmax(new int[]{1,3,4,2});
                assertEquals(4,output);
        }
        @Test
        public  void test1() {
                FindMax test = new FindMax();
                int output = test.findmax(new int[]{-12,-1,-3,-4,-2});
                assertEquals(-1,output);
        }
        @Test
        public  void test2() {
                FindMax test = new FindMax();
                int output = test.findmax(new int[]{-12,-1,-3,-4,-2,0});
                assertEquals(0,output);
        }
}
