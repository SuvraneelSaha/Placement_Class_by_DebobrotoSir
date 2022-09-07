
import java.util.Arrays;
import java.util.Scanner;

public class O1 {
    // Capgemini interview question :
    /*
    total number of elements - 7
        i/p - 6 , 4 , 9 , 10 , 34,56,54
        sum = 4 + 10 + 54
        first we will find the lowest element
        then we will delete the elements which are residing beside the minimum element
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("OG Array :"+ Arrays.toString(arr));

        int sum=0;

        while (arr.length>0)
        {
            int min = arr[0];
            int minpos=0;
            int pos = 0 ;
            int[] brr = new int[arr.length];
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] < min)
                {
                    min = arr[i];
                    minpos = i;

                }
            }

            sum = sum+min;

            for (int i = 0; i < arr.length; i++)
            {
                if(i<minpos-1||i>minpos+1)
                {
                    brr[pos] = arr[i];
                    pos++;
                }
            }

            int[] crr = new int[pos];

            for (int i = 0; i < pos; i++)
            {
                    crr[i] = brr[i];
            }

            arr=crr;


        }
        System.out.println(sum);

    }
}
