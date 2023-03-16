package Week1;

import java.util.Arrays;

//977. Squares of a Sorted Array
/*
Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order. -- this is important
non decreasing order means that it is in an increasing order
 */
public class O11 {
    public static void main(String[] args) {
        int[] arr = new int[] {-7,-3,2,3,11};


        System.out.println(Arrays.toString(sortedSquares(arr)));



    }
    //[-7,-3,2,3,11]
    public static int[] sortedSquares(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];
        int i = 0 ;
        int j = n-1;
        for (int k = 0; k < arr.length; k++)
        {
                if(Math.abs(arr[j])<Math.abs(arr[i]))
                {
                    res[k] = arr[i] * arr[i];
                    i++;
                }
                else
                {
                    res[k] = arr[j]*arr[j];
                    j--;
                }
        }
        return res;
    }
}
