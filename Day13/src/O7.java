import java.util.Arrays;
import java.util.Scanner;

public class O7 {
    //shift
    /*

    //cinemar pordha r moton opore uthe jabe

    10 20 30 40 50
    60 70 80 90 99
    11 22 33 44 55
    22 33 44 55 66

    int temp[] = new int[c] ;
    for(i=0; i<c;i++)
    {
    temp[i] = a[0][i];

     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of row:");
        int r = in.nextInt();

        System.out.println("Please enter the number of column:");
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements : ");
        for (int i = 0; i <r ; i++)
        {
            for (int j = 0; j <c ; j++)
            {
                arr[i][j] = in.nextInt();

            }
        }
        System.out.println("original Array:");
        for(int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }

        /*
        for(int count=1;count<=3;count++)
        {
            int temp[]=new int[c];
            for(int i=0;i<c;i++)
            {
    	        temp[i]=a[0][i];
            }

            for(int i=0;i<=r-2;i++)
            {
    	        for(int j=0;j<c;j++)
    	        {
    		        a[i][j]=a[i+1][j];
    	        }
            }

            for(int i=0;i<c;i++)
            {
    	        a[r-1][i]=temp[i];
            }
        }

         */

    }
}
