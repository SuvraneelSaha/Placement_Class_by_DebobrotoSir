import java.util.Arrays;
import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2= new int[n];
        System.out.println("Please enter the elements in the Array :");
        for (int i = 0; i < n ; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Arrays 1:"+Arrays.toString(arr1));
        System.out.println("Please enter the elements in the Array :");
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println("Arrays 1:"+Arrays.toString(arr2));

        // arr1 - 1 3 5
        // arr2 - 2 4 6
        // res - 1 3 5 2 4 6
        // now sort
        //
        int[] res = new int[n+n];
        int pos = 0 ;
        for (int i = 0; i < n ; i++) {
            res[pos] = arr1[i];
            pos++;
        }
        for (int i = 0;pos< res.length ; i++) {
            res[pos]  = arr2[i];
            pos++;
        }
        System.out.println(Arrays.toString(res));

        for (int i = 0; i < res.length ; i++)
        {
            for (int j = i+1; j < res.length ; j++)
            {
                if(res[i] >res[j])
                {
                    // swap
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        System.out.println("sorted Array = "+Arrays.toString(res));

    }
}
