import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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

        BubbleSort(arr);
    }
    public static void BubbleSort(int[] arr)
    {
        for (int x = arr.length-2; x >=0 ; x--) // arr.length = 5
            // x = 3 ; x>=0 ; x--
        {
            int f = 0 ;
            for (int i = 0; i <= x ; i++)
            {
                if(arr[i] > arr[i+1]) // swap
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    f=1;
                }
            }
            // intelligent bubble sort
            if(f==0)
            {
                break;
            }


        }
        System.out.println("new Array = "+Arrays.toString(arr));

    }

}
/*
It is an in-place sorting algorithm.

How Bubble sort Works ?
Bubble sort uses multiple passes (scans) through an array.
In each pass, bubble sort compares the adjacent elements of the array.
It then swaps the two elements if they are in the wrong order.
In each pass, bubble sort places the next largest element to its proper position.
In short, it bubbles down the largest element to its correct position.


How to Optimize  the bubble sort and make it an intelligent soring algo
If the array gets sorted after a few passes like one or two, then ideally the algorithm should terminate.
But still the above algorithm executes the remaining passes which costs extra comparisons.

sooooo
To avoid extra comparisons, we maintain a flag variable.
The flag variable helps to break the outer loop of passes after obtaining the sorted array.
The initial value of the flag variable is set to 0.
The zero value of flag variable denotes that we have not encountered any swaps.
Once we need to swap adjacent values for correcting their wrong order, the value of flag variable is set to 1.
If we encounter a pass where flag == 0, then it is safe to break the outer loop and declare the array is sorted.


Time complexity :
Best Case	O(n)
Average Case	Θ(n2)
Worst Case	O(n2)


Space Complexity :
Bubble sort uses only a constant amount of extra space for variables like flag, i, n.
Hence, the space complexity of bubble sort is O(1).
It is an in-place sorting algorithm i.e. it modifies elements of the original array to sort the given array.


Properties of Bubble Sort:
Bubble sort is a stable sorting algorithm.
Bubble sort is an in-place sorting algorithm.
The worst case time complexity of bubble sort algorithm is O(n2).
The space complexity of bubble sort algorithm is O(1).
Number of swaps in bubble sort = Number of inversion pairs present in the given array.
Bubble sort is beneficial when array elements are less and the array is nearly sorted.
 */

