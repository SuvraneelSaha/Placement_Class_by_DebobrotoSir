import java.util.Arrays;
import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n =in.nextInt();
        System.out.println("Please enter the size of the col :");
        int m = in.nextInt();



        int[][] arr = new int[n][m];

        System.out.println("Please enter the elements in the Array:");
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < m; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("Original Array : ");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
        int[] copy = new int[m];
        for (int i = 0; i < m; i++)
        {
                copy[i] = arr[0][i];
        }
        // the first row is copied

        // Swapping operation
        for (int row = 0; row < n-1; row++)   // n = 3 , m = 3
        {

            for (int col = 0; col < m; col++)
            {
                arr[row][col] = arr[row+1][col];


            }
            //System.out.println(Arrays.toString(arr[row]));

        }

        for (int i = 0; i < m; i++) {
            arr[n-1][i] = copy[i];
        }

        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
