package SwitchInJava;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		int x=0,y=0;
		System.out.println("Enter a number ");
		Scanner sc= new Scanner(System.in);
		sc.close();
		char move = sc.next().charAt(0);
		switch(move)
		{
		case 'L':
			System.out.println(--x);
			break;
		case 'R':
		    System.out.println(++x);
			break;
		case 'U':
		    System.out.println(++y);
			break;
		case 'D':
		    System.out.println(--y);
			break;
		default:
			System.out.println("Invalid Input");
			
		}
	}

}
// package SwitchInJava;
// import java.util.Scanner;

// public class SwitchCase {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         String A=sc.next();
//         String B=sc.next();
// //1
//         int count1 = A.length();
//         int count2 = B.length();
//         System.out.println(count1 + count2);
// //2
//         int lexi = A.compareTo(B);
//         if(lexi>0)
//         {
//                    System.out.println("Yes");
 
//         }
//         else{
//                   System.out.println("No");
  
//         }
// //3        
//         char ch[] = A.toCharArray();
// 		for (int i = 0; i < A.length(); i++) {

// 			// If first character of a word is found
// 			if (i == 0 && ch[i] != ' ' ||
// 				ch[i] != ' ' && ch[i - 1] == ' ') {

// 				// If it is in lower-case
// 				if (ch[i] >= 'a' && ch[i] <= 'z') {

// 					// Convert into Upper-case
// 					ch[i] = (char)(ch[i] - 'a' + 'A');
// 				}
// 			}
//         /* Enter your code here. Print output to STDOUT. */  
//     }
// 		 char chr[] = B.toCharArray();
// 			for (int i = 0; i < B.length(); i++) {

// 				// If first character of a word is found
// 				if (i == 0 && chr[i] != ' ' ||
// 					chr[i] != ' ' && chr[i - 1] == ' ') {

// 					// If it is in lower-case
// 					if (chr[i] >= 'a' && chr[i] <= 'z') {

// 						// Convert into Upper-case
// 						chr[i] = (char)(chr[i] - 'a' + 'A');
// 					}
// 				}
// 	        /* Enter your code here. Print output to STDOUT. */  
// 	    }
// 		String st = new String(ch);
// 		String st1 = new String(chr);

//         System.out.println(st + " " + st1);	
// 		sc.close();
// }
// }    