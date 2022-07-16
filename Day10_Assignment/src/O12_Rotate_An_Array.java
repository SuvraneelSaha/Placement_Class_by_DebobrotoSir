import java.util.Arrays;
import java.util.Scanner;

public class O12_Rotate_An_Array {
    // Question - enter the size and elements of an Array and then shift the first half of the array
    // with the 2nd half
    // basically Rotate an Array
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array :");
        while (!in.hasNext("[0-9]+"))
        {
            System.out.println("Please enter a valid input");
            System.out.println("Please enter a number");
            in.next();
        }
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements in the array:");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Og Array = "+ Arrays.toString(arr));

        System.out.println("Please enter the Rotation count:");
        while(!in.hasNext("[0-9]+"))
        {
            System.out.println("Enter a number");
            in.nextInt();
        }
        int k = in.nextInt();
        Rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void Rotate(int[] arr , int k)
    {
        k=k%arr.length;
        if(k<0)
        {
            k=k+arr.length;
        }

        // part 1 reverse
        Reverse(arr,0,arr.length-k-1);
        // part 2 reverse
        Reverse(arr,arr.length-k,arr.length-1);
        // part 3 ie Pwhole Array Reverse
        Reverse(arr,0,arr.length-1);

    }
    public static void Reverse(int[] arr,int a,int b)
    {
        int start = a;
        int end =b;
        while (start<end)
        {
            Swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void Swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
