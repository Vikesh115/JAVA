package ExceptionHandling;

//import java.sql.Array;

public class MultipleException {
    public static void main(String[] args)
    {
            try{
                int number[] = new int[20];
             number[21] = 30/0; 
            // According to the precedence compiler check number[10]=30/0 from right to left. 
             //That’s why 30/0 to throw ArithmeticException object and the handler of this exception executes Zero cannot divide any number.
            }
             catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
             {
                System.out.println(e.getMessage());
             }
    }
 
}
