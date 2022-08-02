import java.util.Arrays;
import java.util.Scanner;

public class O19Ankit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r= sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c= sc.nextInt();
        int a[][]= new int[r][c];
        System.out.println("Enter the matrix : ");
        for (int i=0; i<r;i=i+1 )
        {
            for (int j=0;j<c ;j++ )
            {
                a[i][j]=sc.nextInt();
            }
        }
        for (int[] row : a)
        {
            System.out.println(Arrays.toString(row));
        }
        int sum=0;
        for (int i=0;i<c ;i++ )
        {
            System.out.print("The sum of column "+(i+1)+" is : ");
            for (int j=0;j<r ;j++ )
            {
                sum=sum+a[j][i];
            }
            System.out.println(sum);
            sum=0;
        }
    }
}
