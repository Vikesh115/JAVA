package WrapperClass;

public class WrapperclassObjects {
      public static void main(String[] args)
      {
    	Integer x1 = 400, x2 = 400; // x1 and x2 are references of objects so they are not  same
    	if(x1==x2)
    		System.out.println("same");
    	else
    		System.out.println("Not Same");
      }
}
