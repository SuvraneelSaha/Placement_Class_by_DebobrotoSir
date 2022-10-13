import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array :");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("OG Array = "+ Arrays.toString(arr));

        InsertionSort(arr);
        System.out.println("new Array : "+Arrays.toString(arr));

    }
    public static void InsertionSort(int[] arr)
    {
        int key,j;
        for (int x = 1; x < arr.length; x++) {
            key = arr[x];
            // Move  elements of arr[0..x-1]  that are greater than key , to one position ahead of their
            // current position 
            for ( j = x-1; j >=0 && arr[j] > key ; j--)
            {
                arr[j+1]= arr[j];

            }
            arr[j+1]  = key;
            
        }
    }
}
