import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    // wap to store 2 sorted arrays in a 3rd array in a sorted format
    // in a decreasing order
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the 1st Array:");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Please enter the elements in the 1st  Array :");
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Arrays 1:"+ Arrays.toString(arr1));
        System.out.println("Please enter the size of the 2nd Array:");
        int m = in.nextInt();
        int[] arr2= new int[m];
        System.out.println("Please enter the elements in the 2nd  Array :");
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println("Arrays 2:"+Arrays.toString(arr2));

        // creating a final arrray
        int[] res = new int[n+m];

        int pos = 0 ;
        for (int i = 0; i < arr1.length; i++)
        {
            res[pos] = arr1[i];
            pos++;
        }

        // now adding the elements of the 2nd array into the 3rd array
        for (int i = 0; pos<res.length ; i++)
        {
            res[pos] = arr2[i];
            pos++;
        }

        // now printing the whole array
        System.out.println("The resultant array is :"+Arrays.toString(res));

        // now we need to sort the array

        for (int i = 0; i < res.length; i++) {
            for (int j = i+1; j < res.length; j++) {
                if(res[i] < res[j])
                {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }

        System.out.println("Merged Array is "+Arrays.toString(res));

    }
}
