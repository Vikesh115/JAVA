package FinalKeyword;

public class ClassOrStaticFinalVariable {
    static final int MAX =110;

    static final int MIN;
    static{MIN=51;}
    public static void main(String[] args)
    {
        System.out.println(MAX); // Do not need to create object when we use static final variable
        System.out.println(MIN);
    }
}
