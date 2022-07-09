package Array;
public class MaxArray {
    public static void main(String args[])
    {
        int arr[] = {65,15,55,5,45,25};
        int max = arr[0];
        int max2 = arr[0];
        int max3 = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max3=max2;
                max2 = max;
                max = arr[i];
            }
            else if((arr[i] < max && max2 < arr[i])|| max==max2){
                max3=max2;
                max2=arr[i];
                
            }
            else if(max2== max3)
            {
                max3=arr[i];
            }
              
        }
        if(max2 == max )
            max2=-1;

        System.out.println("max value = " + max + " secone max value = " + max2 + " third max value  = " + max3);

    }
}
