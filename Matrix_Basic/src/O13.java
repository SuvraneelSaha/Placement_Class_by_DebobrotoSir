import java.util.Arrays;
import java.util.Scanner;

public class O13 {
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
        CopyInNewArray(arr,r,c);

    }
    static void CopyInNewArray(int[][] arr, int r, int c)
    {
        int[] brr = new int[r*c];

        int i = 0;
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[0].length ; col++)
            {
                brr[i] = arr[row][col];
                i++;
            }
        }
        System.out.println("New Copied Array is  :");
        System.out.println(Arrays.toString(brr));

    }
}
