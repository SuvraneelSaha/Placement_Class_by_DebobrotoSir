import java.util.Arrays;
import java.util.Scanner;

public class O10 {
    // Count of the Numbers present in an Array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements :");
        for (int i = 0; i <arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        // scanning done
        System.out.println("please enter the target element :");
        int target = in.nextInt();
        System.out.println("OG " + Arrays.toString(arr));
        CountTarget(arr,target);
    }
    static void CountTarget(int[] arr , int target)
    {
        int count = 0 ;
        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[i]==target)
            {
                count=count+1;
            }

        }
       for (int element : arr)
       {
           if(element == target)
           {
               System.out.println("Target Present");
           }
           else
           {
               System.out.println("Target not present ");
           }
       }

        System.out.printf("Count of %d is %d",target,count);

    }
}
