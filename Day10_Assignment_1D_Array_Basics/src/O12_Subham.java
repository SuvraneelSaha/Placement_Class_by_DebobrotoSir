import java.util.*;

public class O12_Subham {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
       int[] a = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The given array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

        for(int i=0,j=(n+1)/2;j<n;i++,j++)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("\nAfter shifting the first and second halves,the array became: ");
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
