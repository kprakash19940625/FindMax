import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {

        Calculator calculator;
  @Before
  public void init(){
     calculator = new Calculator();
  }
  @Test
  public void test() {
    int sum = calculator.evaluate("1+2+3");
    assertEquals(8, sum);
  }
  @Test
  public void test1() {
    int mine = calculator.evaluate("4+8+8");
    assertEquals(20,mine);
  }
  @Test
  public void test2() {
    int mine = calculator.evaluate("2+7+4");
    assertEquals(1,mine);
  }
}
