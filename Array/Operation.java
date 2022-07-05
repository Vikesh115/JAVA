package Array;

// import javax.lang.model.util.ElementScanner14;

//import javax.lang.model.util.ElementScanner14;

public class Operation {
    public static int[] insertOperation(int arr[],int pos,int val){
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
    public static int[] deleteOperation(int arr[], int pos){
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
}
















// int n=arr.length;
//         int[] newArr=new int[n+1];
//         int i=newArr.length-1;
//         for(i=0;i<newArr.length;i++){
//             if(i==pos-1) 
//                 newArr[i]=val;
//             else if(i > pos-1)
//                 newArr[i]=arr[i-1];
//             else
//                 newArr[i]=arr[i];
//         }
        
//         return newArr;
