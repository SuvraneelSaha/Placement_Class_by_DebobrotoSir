import java.util.Arrays;
import java.util.Scanner;
// shifting right
public class O3 {
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
        int[] copy = new int[n];

        for (int i = 0; i < n; i++)
        {
            copy[i] = arr[i][0];
        }
        System.out.println(Arrays.toString(copy));

        for (int row = 0; row < m-1; row++)   // no of swapping
        {

            for (int col = 0; col < n; col++)
            {
                arr[col][row+1] = arr[col][row];


            }
            System.out.println(Arrays.toString(arr[row]));

        }

        System.out.println("REs ");
        for (int i = 0; i < m; i++)
        {
            arr[i][m-1] = copy[i];
        }


    }
}
