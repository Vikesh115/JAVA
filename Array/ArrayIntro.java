package Array;

public class ArrayIntro {
    public static void main(String[] args)
    {
        int []a = {10,20,30,40};
        System.out.println(a.length);
        a[2] = 50; // it will replace array value at index 2 and print 50
        System.out.println(a[2]);
        System.out.println(a[1]);
        
        System.out.println(" ");

        int []b = new int[3];
        int x = 10;
        for(int i=0; i<b.length; i++)
        {
            b[i] = x;
            x= x+10;
            System.out.println(b[i]);
        }
    }   
}
