import java.util.Arrays;
import java.util.Scanner;

// print the unique elements in an array
// ex - 1 2 3 4 5 6 6 5 4 3 2 1
// then the unique elements will be 1 2 3 4 5 6

public class O3 {
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

        for (int i = 0; i <arr.length ; i++) // ex - arr 3 2 3
        {
            int count = 1 ;
            for (int j = i+1; j <arr.length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    count = count+1;
                }
            }
            if(count==1)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
