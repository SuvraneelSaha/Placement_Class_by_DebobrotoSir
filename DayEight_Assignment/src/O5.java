import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        // Enter the size and elements of an array and find the average, largest,smallest and the sum
        //together using a single loop.
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        System.out.println("Please enter the Elements:");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = in.nextInt();
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
            sum = sum + arr[i];


        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("The min Element out of %d elements is %d",n,min);
        System.out.println();
        System.out.printf("The max Element out of %d elements is %d",n,max);
        System.out.println();
        System.out.printf("The sum of %d Elements is %d",n,sum);
        System.out.println();
        System.out.printf("The Average of %d elements is %d",n,sum/5);
    }
}
