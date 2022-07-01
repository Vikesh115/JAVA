package UserInput;
import java.io.*;

public class BufferredReaderClass {
	public static void main(String[] args) 
		     throws IOException{
	      BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		         String s = br.readLine();
		         System.out.println("You entered " + s);
		     }
}

