package operators;
import java.util.Scanner;
public class LogicalOperator {
  public static void main(String[] args) {
	  String user= "vikesh", pwd = "VIKKU";
	  Scanner sc = new Scanner(System.in);
	  String iu = sc.next();
	  String ip = sc.next();
	  if(user.equals(iu) && pwd.equals(ip))
		  System.out.println("WELCOME");
	  else
		  System.out.println("TRY AGAIN");
	  boolean x = true, y=false;
	  System.out.println(x && y);
	  System.out.println(x || y);
	  System.out.println(x != y);
	  sc.close();
  }
}

