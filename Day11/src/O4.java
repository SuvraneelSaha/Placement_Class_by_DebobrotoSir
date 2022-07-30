import java.util.Arrays;
import java.util.Scanner;

public class O4 {
    public static void main(String[] args) {
        // bubble sort
        // after each iteration the biggest element will be at the last index position

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();

        }


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
        // in case of bubble sort - if there is no swapping
        // then it can be said that sorting has been completed
        // but in the case of selection sort it cant be said
        // confirmly

        // no swap - bubble sort - sorted
        // no swap - selection  sort - sorted cant be guaranteed


        // intelligent bubble sort is possible
        // but intelligent selection sort is not possible


        System.out.println(Arrays.toString(arr));

    }
}
