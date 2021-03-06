import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(CalculatorTest.class);
      int total_no = result.getRunCount();
      int failure_no = result.getFailureCount();
      int success_no = total_no - failure_no;
      System.out.println("#################################################################");
      for(int i=0;i<10;i++)
         System.out.println("");
      System.out.println("Total \t Success \t Failure");
      System.out.print(total_no+"\t");
      System.out.print("\t"+success_no+"\t");
      System.out.println("\t"+failure_no);
      System.out.print("Failed Test Cases:\n\t");
      System.out.println(result.getFailures());
      for(int i=0;i<10;i++)
         System.out.println("");
      System.out.println("################################################################");
   }
}
