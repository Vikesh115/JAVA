package Array;
import java.util.Scanner;
public class SortArray { 
public static void main(String[] args)   
{  
//creating an instance of an array
Scanner s = new Scanner(System.in);

int n= s.nextInt();   
int[] arr = new int[n]; 
s.close();
for(int i=0; i<arr.length; i++)
{
    arr[i] = s.nextInt();
}

//sorting logic  
for (int i = 0; i < arr.length; i++)   
{  
for (int j = i + 1; j < arr.length; j++)   
{  
int tmp = 0;  
if (arr[i] > arr[j])   
{  
tmp = arr[i];  
arr[i] = arr[j];  
arr[j] = tmp; 
}  
}  
//prints the sorted element of the array  
System.out.println(arr[i]);  
}  
}  
}
