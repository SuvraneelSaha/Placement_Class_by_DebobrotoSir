import java.util.Arrays;
import java.util.Scanner;

public class O14 {
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
        EvenOddArray( arr);
    }
    static void EvenOddArray(int[][] arr)
    {

        int i=0; // for even
        int j=0; // for odd nums

        for (int row = 0; row <arr.length ; row++)
        {
            for (int col = 0; col <arr[0].length ; col++)
            {
                    if(arr[row][col] % 2 ==0 )
                    {

                        i++;
                    }
                    else
                    {

                        j++;
                    }
            }
        }
        int[] even = new int[i];
        int e=0;
        int[] odd = new int[j];
        int o = 0;
        for (int row = 0; row < arr.length ; row++)
        {
            for (int col  = 0; col  <arr[0].length ; col ++)
            {
                if(arr[row][col] % 2==0 )
                {
                    even[e] = arr[row][col];
                    e++;
                }
                else
                {
                    odd[o] = arr[row][col];
                    o++;
                }
            }
        }


        System.out.println("even array = "+Arrays.toString(even));
        System.out.println("Odd array = "+Arrays.toString(odd));

    }
}
