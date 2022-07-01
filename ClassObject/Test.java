package ClassObject;
import java.util.Scanner;
class Test{
public static void main(String[] args)
  {
    // Complex c1 = new Complex(10,20);
    // c1.print();

    Scanner sc = new Scanner(System.in);
    	  int x = sc.nextInt();
    	  int y = sc.nextInt();
    Complex c1 = new Complex(x,y);
    c1.print();

    Complex c2 = new Complex(22,33);
    c1.add(c2);
    c1.print();
    sc.close();
  }   
}  