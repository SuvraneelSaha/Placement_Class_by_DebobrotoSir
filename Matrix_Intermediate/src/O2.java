import java.util.Arrays;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Square matrix:");
        int n =in.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col <n ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("Original Array : ");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        int[][] brr = new int[n][n];
        int k = 0;
        for (int row = n-1; row >= 0; row--)
        {
            for (int col = 0; col < n ; col++)
            {
                brr[col][k] = arr[row][col];

            }
            k++;
        }
        System.out.println("New Array : ");
        for (int[] row : brr)
        {
            System.out.println(Arrays.toString(row));
        }

    }
}
