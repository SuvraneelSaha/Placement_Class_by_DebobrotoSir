import java.util.Arrays;
import java.util.Scanner;

public class O11 {
    //Enter the size and elements of an array and then find the middle most value.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // size
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        // Scanning
        System.out.println("please enter the elements :");
        for (int i = 0; i <arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG Array :"+ Arrays.toString(arr));

        int start = 0 ;
        int end = arr.length-1;
        int mid = start + (end - start)/2;
        if(n%2==0)
        {
            System.out.printf("Middle elements are %d and %d",arr[mid],arr[mid+1]);
        }
        else
        {
            System.out.printf("Middle Element is %d ",arr[mid]);

        }

    }
}
