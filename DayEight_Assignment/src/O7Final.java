import java.util.Arrays;
import java.util.Scanner;

public class O7Final {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        int n = in .nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array :");
        // for taking input
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        // printing the Original Array :
        System.out.println("Og Array = "+ Arrays.toString(arr));
        ReverseArray(arr);
        System.out.println("Reversed Array = "+Arrays.toString(arr));


    }
    // the Reverse function has two variables
    // where the start var will run from 0
    // and the end var will run from arr.length -1
    // start var will increase in each iteration by 1
    // and the end var will decrease in each iteration by 1

    static void ReverseArray(int[] arr)
    {
        int start = 0 ;
        int end = arr.length - 1;

        while (start<end) // this while lopp will run until and unless the start var becomes > than that of the end var
            // and when that happens the while loop will break
        {
            swap(arr,start,end); // the elements are getting swapped by this
            start ++;
            end--;
        }
    }
    // simple swapping technique used just used in case of an array

    static void swap(int[] arr,int a,int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
