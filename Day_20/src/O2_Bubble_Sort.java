import java.util.Arrays;
import java.util.Scanner;

public class O2_Bubble_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements :");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        // bubble sort
        for (int x = arr.length-2; x >=0 ; x--)
        {
            int f = 0 ;
            for (int i = 0; i <= x ; i++)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    f=1;
                }
            }
            if(f==0)
            {
                break;
            }


        }

        System.out.println(Arrays.toString(arr));
    }
}
