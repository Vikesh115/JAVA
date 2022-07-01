package IfElse;
import java.util.Scanner;
public class SumOfNaturalNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.close();
	if(n<0)
	{
		System.out.println("Invalid Input");
		return;
	}
		System.out.println("Sum of natural numbers "+n*(n+1)/2);
}

}
