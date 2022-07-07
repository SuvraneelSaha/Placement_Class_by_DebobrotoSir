import java.util.Arrays;
import java.util.Scanner;
// Enter the size and elements of an array. After that enter a search value and find if the value is
//present in the array or not. If yes, find the places.
public class O9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements :");
        for (int i = 0; i <arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        // scanning done
        System.out.println("please enter the target element :");
        int target = in.nextInt();
        System.out.println("OG " + Arrays.toString(arr));
        System.out.printf("the index of the target element %d is %d ",target,binarysearch(arr,target));

    }
    static int binarysearch(int[] arr, int target) // the name can be different in arguments
    // in case of parameters also it can be different
    // its actually passing the value
    {
        // CRUCIAL STEPS :
        // WE ARE USING TWO POINTERS ONE POINTER AT THE STARTING INDEX AND ANOTHER POINTER AT THE END
        // 1 ] find the middle element of the array
        // 2] if(target >arr[mid])
        // start = mid + 1 ;
        // 3] if(target <arr[mid])
        // end = mid -1 ;
        // EX - 2 , 4 ,6 ,8, 10 ,12 ,14
        // EX - TARGET ELEMENT = 13
        // then return would be -1

        int start = 0 ;
        int end = arr.length-1;
        while(start<=end)
        {
            int middle = start + (end - start)/2;
            if(target>arr[middle])
            {
                start = middle + 1 ;
            }
            else if(target<arr[middle])
            {
                end = middle -1 ;
            }
            else
            {
                return middle;  // RETURNING THE INDEX POSITION
            }
        }
        // if any of the above conditions doesnt gets executed then the program will return -1
        // as the element is not present in the array
        return -1;
    }
}
