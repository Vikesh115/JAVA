package String;
import java.util.Scanner;

public class SubstringMethod {
public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(s.substring(start,end));
        in.close();
    }
}

