package UserInput;
import java.util.Scanner;
public class ScannerClass {
      public static void main(String[] args)
      {
    	  Scanner sc = new Scanner(System.in);
    	  String s = sc.nextLine();
    	  System.out.println("Your Entetred string "+ s);
    	  int x = sc.nextInt();
    	  System.out.println("Your Entered integer "+ x);
		  sc.close();
      }
} 
