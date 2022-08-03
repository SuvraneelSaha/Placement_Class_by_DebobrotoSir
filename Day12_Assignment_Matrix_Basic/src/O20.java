
import java.util.Arrays;
import java.util.Scanner;

public class O20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the square matrix ");
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Please enter the elements in the Array ");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0 ; col < n ; col++)
            {
                arr[row][col] = in.nextInt();

            }
        }
        System.out.println("original Array is :");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {
                if(row+col == 2 || row==col)
                {
                    System.out.print(arr[row][col] + " ");
                }
                else
                {
                    System.out.print("_" +" ");
                }
            }
            System.out.println();
        }
    }
}
