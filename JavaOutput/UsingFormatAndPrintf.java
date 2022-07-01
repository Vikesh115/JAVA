package JavaOutput;
//import java.lang.Math.*;
public class UsingFormatAndPrintf {
  public static void main(String[] args) {
	  int x = 100, y=200;
	  System.out.format("value of x is %d\n", x); // %d is placeholder for integer 
	  System.out.format("value of y is %d\n", y);
      double z = Math.PI;
      System.out.println(z);
	  System.out.format("value of PI is %.2f\n", z);
	  System.out.format("value of PI is %5.2f\n", z);
	  System.out.format("value of PI is %05.2f\n", z);

  }
}
