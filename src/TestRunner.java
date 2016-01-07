import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(CalculatorTest.class);
      int total_no = result.getRunCount();
      int failure_no = result.getFailureCount();
      int success_no = total_no - failure_no;
      System.out.println("Total \t Success \t Failure");
      System.out.print(total_no+"\t");
      System.out.print("\t"+success_no+"\t");
      System.out.println("\t"+failure_no);
   }
}
