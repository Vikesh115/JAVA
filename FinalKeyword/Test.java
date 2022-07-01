package FinalKeyword;

public class Test extends FinalMethod {
   // void fun()   // We cannot override same method who is defined as a final
                   // when we removw final from fun() function then it compile fine
    {
        System.out.println("Derived");
    }
}