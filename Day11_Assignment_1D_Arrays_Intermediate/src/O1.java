import java.util.Arrays;
import java.util.Scanner;

public class O1 {
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
        int count = 0;
        for (int i = 0; i <arr.length ; i++) // this for loop is for selecting an element which will be compared
        {
            for (int j = i+1; j < arr.length ; j++)  // this for loop which will be comparing the element with its subsequent elements
                // ie the elements which are lying ahead of that element
            {
                if(arr[i] == arr[j])
                {
                    count = count +1;
                    break;
                }
            }
        }
        System.out.println("Total number of duplicate elements are "+count);
    }
}
