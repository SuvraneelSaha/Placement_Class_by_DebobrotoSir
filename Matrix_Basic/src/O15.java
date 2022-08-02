import java.util.Arrays;
import java.util.Scanner;

public class O15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row");
        int r = in.nextInt();
        System.out.println("enter the size of the Column");
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Please enter the elements in the 1st 2D array or matrix");
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        // original array
        System.out.println("1st original Array");
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));

        }
        int[][] brr = new int[r][c];
        System.out.println("Please enter the elements in the 2nd 2D array or matrix");
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                brr[row][col] = in.nextInt();
            }
        }
        System.out.println("2nd original Array");
        for(int[] row : brr)
        {
            System.out.println(Arrays.toString(row));

        }
        // now addition of the two matrix
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                arr[row][col] = arr[row][col] +  brr[row][col];
            }
        }

        System.out.println("Addition of two matrix is :");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }
}
