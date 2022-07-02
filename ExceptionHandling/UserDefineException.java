package ExceptionHandling;
//java.lang package;
public class UserDefineException {
    public static void main(String[] args)
    {
      try 
      {
        throw new MyException ("Vikesh");
      }
      catch (MyException e)
      {
         System.out.println("Raut");
         System.out.println(e.getMessage());
      }
    }
}
 class MyException extends Exception
 {
    public MyException(String s)
    {
        super(s);

    }
     
}
