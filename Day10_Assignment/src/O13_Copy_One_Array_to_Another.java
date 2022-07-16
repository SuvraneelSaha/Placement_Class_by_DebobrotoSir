import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class O13_Copy_One_Array_to_Another {
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
        System.out.println("OG Array = "+ Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length];
        //
        for (int i = 0; i <arr2.length ; i++)
        {
                arr2[i] = arr1[i];
        }
        System.out.println("New Array = "+Arrays.toString(arr2));



    }

}
