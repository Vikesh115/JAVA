package ExceptionHandling;
import java.util.Scanner;
public class ThrowAndThrowsexception {
    public static void main(String[] args)
    {
        try {
            methodA ();
            System.out.println("Exit try for main() ");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("ArithmeticException caught....");
            ex.printStackTrace();
        }
        System.out.println("Exit main successfully");
    }


public static void methodA() throws ArithmeticException {

    int a=5;
    int c;
    Scanner in = new Scanner (System.in);

    System.out.println("Enter numeric value for variable b");

    int b = in.nextInt();

    if(b==0)
       throw new ArithmeticException();

    else 
       c = a/b;
    
    System.out.println("Exit methodA()");   
 }
}