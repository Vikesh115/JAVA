// Exception Handling Using Try-Catch-Finally
// Compile time exception demo
// checked Exception
package ExceptionHandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class FileNotfoundException {
    public static void main(String[] args)
    {
      try{
        Scanner in = new Scanner(new File("test.in"));

        // if everything goes well below statement would be executed
        // if en exception will occur in previous statement
        // below statement will not be executed
        System.out.println("Exit main"); 
        in.close();
      }

      // error handling seperated from the main logic
      catch(FileNotFoundException ex){
           System.out.println("File not found caught........");
      }
      
      // OPTIONAL
      // always run regardless of exception status
      finally{
        System.out.println("Finally block runs regardless of the state of the exception....");
      }

      // after try-catch-finally
      // will not be executed in case of an uncaught exception
      System.out.println("After try-catch-finally, life goes on...");
    
    }
}
