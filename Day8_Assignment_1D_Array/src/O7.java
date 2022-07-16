import java.util.Arrays;
import java.util.Scanner;

// A classic mistake of how not to reverse an Array
// the Swapping wont take place cause the same Array elements will be stored


public class O7 {
    //if the size of the array is 5 and the array is like below:
    // 10 20 30 40 50
    //Then it will'store the array in reverse order. The positions of the array elements will be changed
    // 50 40 30 20 10
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Please enter the Elements:");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array "+ Arrays.toString(arr));
        for (int i = 0; i <n ; i++)
        {
            arr[i] = arr[n-1-i]; // this wont work

        }
        System.out.println("New Array "+Arrays.toString(arr));
        
    }
}
