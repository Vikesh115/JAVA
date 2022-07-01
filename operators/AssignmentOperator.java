package operators;

public class AssignmentOperator {
  public static void main(String[] args) {
	  int x=10, y=5, z;
	  x+=y; // x= x+y;
	  System.out.println(x);
	  x%=y; // x=x%y        Give Remainder
	  System.out.println(x);
	  z=x=y;
	  System.out.println(z);
  }
}
