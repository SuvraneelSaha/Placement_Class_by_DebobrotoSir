package Week1;

import java.util.Arrays;

// 977. Squares of a Sorted Array
// not optimized

public class O10 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));


    }
    public static int[] sortedSquares(int[] arr) {
        for(int i = 0 ; i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr[i] = -arr[i];
                arr[i] = arr[i] * arr[i];
            }
            else if(arr[i]==0)
            {
                arr[i] = 0 ;
            }
            else
            {
                arr[i] = arr[i] * arr[i];
            }
        }
        Arrays.sort(arr);

        return arr;
    }
}
