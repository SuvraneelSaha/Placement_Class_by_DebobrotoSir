package Week1;

import java.util.Arrays;

public class O3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++)
        {
            arr[1]++;

        }
        --arr[1];
        System.out.println(Arrays.toString(arr));
    }
}
