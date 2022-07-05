package Array;

// import java.util.Scanner;

public class Insertion {
    public static void main(String[] args){
        int pos = 2;
        int val = 19;
       // Scanner sc = new Scanner(System.in);
        int []arr = {10,20,30,40};

        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i =0; i<4; i++)
        // {
        //     arr[i] = sc.nextInt();
        // }
        System.out.println(" Array : 10 20 30 40 ");

        int newArr[] = Operation.insertOperation(arr, pos, val);
        System.out.print( " Array after Insert : ");
        for(int i=0; i<newArr.length; i++)
        {
            System.out.print(newArr[i] + " ");
        }

        System.out.println();

        int deletedArray[] = Operation.deleteOperation(arr, pos);
        System.out.print(" Array after Delete : ");
        for(int i=0; i < deletedArray.length; i++)
        {
            System.out.print(deletedArray[i] + " ");
        }

    }
}








// Scanner sc=new Scanner(System.in);
//         int val=5;
//         int pos=4;
//         int n = sc.nextInt();
//         int arr[]=new int[n];
        
//         for(int i=0; i<n; i++)
//         {
//             arr[i] = sc.nextInt();
//         }

//         int[] neArr=Operation.insertOperation(arr ,pos,val);
        
//         for(int j=0; j < neArr.length; j++)
//         {
//             System.out.print(neArr[j]+ " ");
//         }
//         sc.close();