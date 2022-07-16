import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class O14_Concatenate_2Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Please enter the elements in the array 1 :");
        for (int i = 0; i <arr1.length ; i++)
        {
            arr1[i] = in.nextInt();
        }

        System.out.println("Please enter the size of the 2nd Array:");
        int m = in.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Please enter the elements in the array  :");
        for (int i = 0; i < arr2.length ; i++)
        {
            arr2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Method3(arr1,arr2);


    }
    public static void Method1(int[] arr1 ,int[] arr2)
    {
     int[] result = new int[arr1.length+arr2.length];

     // take the inout of the 1st array into the resultant array
        for (int i = 0; i <arr1.length ; i++)
        {
            result[i] = arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++)
        {
            result[arr1.length+i] = arr2[i];
        }

        System.out.println(Arrays.toString(result));


    }

    public static void Method2(int[] arr1,int[] arr2)
    {
        int[] result = IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).toArray();
        System.out.println(Arrays.toString(result));
        // if string array is present use Stream instead of IntStream

    }
    public static void Method3(int[] arr , int[] arr2)
    {
        int[] c = new int[arr.length+arr2.length];
        System.arraycopy(arr, 0, c, 0, arr.length);
        System.arraycopy(arr2, 0, c, arr.length, arr2.length);
        System.out.println(Arrays.toString(c));
    }


}
