import java.util.Arrays;
import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n:");
        int n = in.nextInt();
        String[] arr = new String[n];
        /*
        i/p
        banibrata
        rajanya
        ahan
        suvraneel
        subham


        [ahan, banibrata, rajanya, subham, suvraneel] o/p

         */
        System.out.println("Enter Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        for (int x = arr.length - 2; x >= 0; x--)
        {
            int f = 0;
            for (int i = 0; i <= x; i++)
            {

                if (arr[i].compareTo(arr[i+1])>0 )
                {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    f = 1;
                }
            }
            if (f == 0)
            {
                break;
            }
        }

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));

    }
}
