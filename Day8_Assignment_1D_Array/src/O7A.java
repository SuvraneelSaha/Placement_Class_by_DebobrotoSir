import java.util.Arrays;
import java.util.Scanner;
// Another Mistake
// Unable to Find the Error or the point where the logic error is taking place

public class O7A {
    public static void main(String[] args) {
        // A classic mistake of how not to reverse an Array
// the Swapping wont take place cause the same Array elements will be stored
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
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;

        }
        System.out.println("New Reversed Array "+Arrays.toString(arr));
    }
}
