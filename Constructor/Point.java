package Constructor;

public class Point {
    int x,y;

    void print() // Method, return type void
    {
        System.out.print(x + " " + y);
    }
    
    Point(int a, int b)  // Constructor
    {
      x = a;
      y = b;
      System.out.println("Constructor Called");
    }
}
