import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the row :");
        int n =in.nextInt();
        System.out.println("Please enter the size of the column :");
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

        int[] brr = new int[n*m];
        // putting the elements of the matrix into the brr array
        int k=0;
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < m; col++)
            {
               brr[k] =arr[row][col];
               k++;
            }
        }
       // System.out.println(Arrays.toString(brr)); // just for checking

        // sorting the brr array using bubble sort
        // bubble sort self made
        // otherwise we could just do sort(brr) ;
        for (int i = 0; i < brr.length ; i++)
        {
            for (int j = 0; j < brr.length-i-1 ; j++) {
                 if(brr[j]>brr[j+1])
                 {
                     int temp = brr[j];
                     brr[j]=brr[j+1];
                     brr[j+1] = temp;
                 }
            }
        }
        // now putting the elements of the brr array into the matrix
        k=0;
        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < m; col++)
            {
               arr[row][col] = brr[k];
                k++;
            }
        }

        // now printing the matrix
        System.out.println("Sorted Matrix :");
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }


        
    }
}
