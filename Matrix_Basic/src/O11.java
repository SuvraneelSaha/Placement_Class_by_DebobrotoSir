import java.util.Arrays;
import java.util.Scanner;

public class O11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row");
        int r = in.nextInt();
        System.out.println("enter the size of the Column");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Please enter the elements in the 2D array or matrix");
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        // original array
        System.out.println("original Array");
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));

        }
        SwapMain(arr);

        System.out.println("new Matrix");
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));

        }
    }
    static void SwapMain(int[][] arr)
    {
        int c = arr[0].length;
        for (int i = 0; i < arr.length; i++)
        {
            int temp = arr[i][0];
            arr[i][0] = arr[i][c-1];
            arr[i][c-1] = temp;
        }
    }
}
