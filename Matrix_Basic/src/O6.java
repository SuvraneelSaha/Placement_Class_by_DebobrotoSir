import java.util.Arrays;
import java.util.Scanner;

public class O6 {
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
        operations(arr,r,c);

    }
    public static void operations(int[][] arr,int rowSize,int columnSize)
    {
        int max = arr[0][0];
        int min = arr[0][0];
        int sum = 0 ;
        // can be modified with the help of a enhanced for loop
        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[row].length ; col++)
            {
                if(arr[row][col] > max)
                {
                    max = arr[row][col];
                }
                if(arr[row][col] <min)
                {
                    min = arr[row][col];
                }
                sum = sum + arr[row][col];

            }
        }
        // printing the 2d array also
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("the max element is "+max);
        System.out.println("the min element is "+min);
        System.out.println("the sum of all the elements are "+sum);
        System.out.println("the average of all the elements is "+(sum/(rowSize*columnSize)));
    }
}
