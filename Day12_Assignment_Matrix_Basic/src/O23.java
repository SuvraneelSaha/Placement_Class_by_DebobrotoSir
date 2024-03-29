import java.util.Arrays;
import java.util.Scanner;

public class O23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row ");
        int n = in.nextInt();
        System.out.println("Please enter the size of the column");
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
        // printing the original array
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        // building the logic for the maximum element present in the column
        for (int j = 0; j < m ; j++)
        {
            int max = arr[0][j];

            for (int i = 0; i <n ; i++)
            {
                if(arr[i][j] > max )
                {
                    max = arr[i][j];
                }
            }
            System.out.printf("The maximum element of the %d column is %d",j+1,max);
            System.out.println();
        }


    }
}
