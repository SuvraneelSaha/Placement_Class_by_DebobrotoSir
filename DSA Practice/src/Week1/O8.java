package Week1;

import java.util.Arrays;
import java.util.Scanner;
// 485. Max Consecutive Ones
public class O8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter only 1s and 0s");
        for (int i = 0; i < arr.length; i++)
        {
            // in.hasNext("[]+"))
            // this + is used for combinations
            // and the [] is used to denote the pattern
            //
            while (in.hasNext("[2-9]+"))
            {
                System.out.println("NA");
                in.next();
            }
            arr[i] = in.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxConsecutiveOnes(arr));

    }
    public  static int findMaxConsecutiveOnes(int[] arr)
    {
        int count = 0;
        int ans = 0 ;
        for (int i = 0; i < arr.length; i++) // 1 1 0 1 1 1
        {
            if(arr[i]==1)
            {
                count++;
                ans = Math.max(ans,count);
            }
            else
            {
                count=0;
            }
        }
        return ans;
    }
}
