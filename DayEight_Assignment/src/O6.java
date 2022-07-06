import java.util.Arrays;
import java.util.Scanner;

public class O6 {
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
        System.out.println("Printing in reverse :");
        for (int i = n-1; i >=0 ; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
