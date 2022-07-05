package Array;
import java.util.Scanner;
public class UserInputArray {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt(); // Array size by user input
        int[] arr = new int[n]; 

        // int a = s.nextInt();
        // arr[0] = a; // value of a by user at index 0
        // arr[0] = s.nextInt();

        //  int b = s.nextInt();
        //  arr[2] = b;  // value of a by user at index 2
        // arr[2] = s.nextInt();
        for(int i=0; i<n; i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);
        }
        s.close();
        
    }
}
