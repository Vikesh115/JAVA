package FinalKeyword;

public class InstanceFinalVariable {

    final int x = 101;  // Initialise Instance final variable method 1
    
    final int y;  // Initialise Instance final variable within bracket method 2
    {y=201;}

    final int z;
    InstanceFinalVariable()     // Initialise Instance final variable inside constructor method 3
    {
         z = 301;
    }
    public static void main(String[] args)
    {
      InstanceFinalVariable t = new InstanceFinalVariable();
      System.out.println(t.x);
      System.out.println(t.y);
      System.out.println(t.z);

    }
}
