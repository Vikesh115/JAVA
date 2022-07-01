package ExceptionHandling;

public class MethodCallStack {
    public static void main(String[] args)
    {
        try {
            methodA();

            System.out.println("Exit main()");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("ArithmeticException caught ... ");
            // the error handler simply prints the stack trace in reverse order
            ex.printStackTrace();
        }
        finally {
            System.out.println("finally-block runs regardless of the state of exception");
        }

        System.out.println("After try-catch-finally, life goes on... ");
    }
    public static void methodA()
    {
        System.out.println("Enter methodA()");
        try{
        int a= 5, b= 0;
        int c=a/b;
        System.out.println(c);
        }
        finally {
            System.out.println("finally in methodA() ");
        }
        //
        System.out.println("Exit methodA()");
    }
}
