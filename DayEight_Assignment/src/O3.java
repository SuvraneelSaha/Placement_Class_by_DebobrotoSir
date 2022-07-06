import java.util.Arrays;
import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Please enter the Elements:");
        for (int i = 0; i <n ; i++)
        {
            arr[i] = in.nextInt();
            if(arr[i]>max)
            {
                max = arr[i];
            }


        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("The max Element out of %d elements is %d",n,max);
    }
}
