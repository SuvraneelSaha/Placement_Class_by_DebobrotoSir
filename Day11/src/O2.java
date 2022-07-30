import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int n = in.nextInt();

        int[] arr = new int[n]; // initialization

        System.out.println("enter elements "); // taking the elements in the array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // Selection Sort - important
        // 50 30 40 10 20 -- arr
        // in case of large numbers we need an algorithm
        // the first element will be first selected
        // ie 50
        //follow notes -- for explanation

        // code
        // selection sort is also known as minimum value finding sort
        // as with each iteration the minimum value of the array
        for (int i = 0; i <= arr.length-2 ; i++)
        {

            for (int j = i+1; j <=arr.length-1 ; j++) {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // arr.length - 2 cause the last element wouldnt be needed to compare
        // arr.length -1 cause we need to search the whole array according
        // to the index values







        System.out.println("the elements after sorting is :");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
