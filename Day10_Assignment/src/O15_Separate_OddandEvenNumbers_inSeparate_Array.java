import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class O15_Separate_OddandEvenNumbers_inSeparate_Array {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Please enter the size of the Array:");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid number");
            in.nextInt();
        }
        int n =in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the Array:");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("og Array "+ Arrays.toString(arr));
        int evenCount = 0 ;


        int oddCount = 0 ;

        for (int i = 0; i <arr.length ; i++)
        {
            if(arr[i] %2!=0)
            {
                oddCount++;
            }
            else
            {
               evenCount++;
            }
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        for (int i = 0,j=0,k=0; i <arr.length ; i++)
        {
            if(arr[i] % 2 ==0)
            {
                even[j] = arr[i];
                j++;
            }
            else
            {
                odd[k] = arr[i];
                k++;
            }
        }

        System.out.println("odd Array = "+Arrays.toString(odd));
        System.out.println("even Array = "+Arrays.toString(even));
    }
}
