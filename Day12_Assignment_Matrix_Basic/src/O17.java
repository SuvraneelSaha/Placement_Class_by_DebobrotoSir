import java.util.Arrays;
import java.util.Scanner;

public class O17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the row");
        int r = in.nextInt();
        System.out.println("enter the size of the Column");
        while (!in.hasNext("[1-9]+"))
        {
            System.out.println("enter a number");
            in.nextInt();
        }
        int c = in.nextInt();
        if(c%2==0)    // here we are manually decreasing the size of the columns if the column is an even integer
        {
            c=c-1;
        }
        int[][] arr = new int[r][c];
        System.out.println("Please enter the elements in the  2D array or matrix");
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
        // printing the middle column
        // arr[i][c/2]
        for (int i = 0; i < arr.length ; i++)
        {
            System.out.print(arr[i][c/2] + " ");
        }

    }
}
