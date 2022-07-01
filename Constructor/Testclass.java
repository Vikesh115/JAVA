package Constructor;
import java.util.Scanner;

public class Testclass {
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Point p = new Point(a,b);
    
    p.print(); 

    sc.close();
}
       
} 
// Point p = new Point(10,20);
//     p.print(); 
