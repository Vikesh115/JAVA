package Array;
import java.util.Scanner;
public class Operation {


    public static int[] insertOperation(int arr[],int pos,int val)
    {
       int index = arr.length+1;
        int newArr[] = new int[index];
        for(int i =0; i<index; i++)
        {
            if(i == pos-1) // we insert value at index pos-1
               newArr[i] = val;
            else if(i<pos-1)
                newArr[i] = arr[i];
            else 
                newArr[i] = arr[i-1];    
        }
        return newArr;
    }


    public static int[] deleteOperation(int arr[], int pos)
    {
        int index = arr.length-1;
        int deletedArray[] = new int[index];
        for(int i=0; i< index+1; i++)
        {
            if(i == pos-1)
                continue;
            else if(i > pos-1) // pos-1 = 1, we assign value from index 2 to index+1
                deletedArray[i-1] = arr[i]; 
            else 
                deletedArray[i] = arr[i];

        }
        return deletedArray;
    }

public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int pos = sc.nextInt();
   int val = sc.nextInt();
   int arr[] = new int[n];
   for(int i=0; i<n; i++)
   {
    arr[i] = sc.nextInt();
   }
   new Operation();
   System.out.println(Operation.insertOperation(arr, pos, val));
   for(int i=0; i<n; i++)
    {
        System.out.println(arr[i]);
    }
   new Operation();
   System.out.println(Operation.deleteOperation(arr, pos));
   for(int i=0; i<n; i++)
    {
        System.out.println(arr[i]);
    }
   sc.close();
}
}
