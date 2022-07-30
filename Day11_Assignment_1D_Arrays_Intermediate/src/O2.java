import java.util.Arrays;
import java.util.Scanner;
// Wap in which only print the unique elements
// nothing elese
// ex - 1 3 1
// then the only unique element will be 3
public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array :");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int i,j;

        for ( i = 0 ; i<arr.length;i++)
        {

            for ( j = 0; j < arr.length; j++)
            {

                if(arr[i] == arr[j] && i!=j)
                {

                    break;
                }
            }
            if(j==n)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
