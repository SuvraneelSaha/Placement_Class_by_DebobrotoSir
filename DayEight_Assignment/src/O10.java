import java.util.Arrays;
import java.util.Scanner;
// Enter the size and elements of an array. After that enter a search value and find the frequency
//of that value
public class O10 {
    // Count of the Numbers present in an Array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // size
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        // Scanning
        System.out.println("please enter the elements :");
        for (int i = 0; i <arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        // scanning done
        // Target element
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
        boolean present = false;
       for (int element : arr)
       {
           if(element == target)
           {
               present = true;
               break;
           }
           else
           {
               present = false;

           }
       }
       if(present == false)
       {
           System.out.printf("%d is not Found ",target);
       }
        System.out.println();


        System.out.printf("Count of %d is %d",target,count);

    }
}
