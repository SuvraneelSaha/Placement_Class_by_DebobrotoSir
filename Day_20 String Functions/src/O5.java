import java.util.Arrays;
import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        // sorting by length by bubble sort

        // ahan , ahana , niggas,niggachan.
        Scanner in = new Scanner(System.in);
        System.out.println("enter n:");
        int n = in.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        for (int x = arr.length - 2; x >= 0; x--)
        {

            for (int i = 0; i <= x; i++)
            {
                int word = arr[i].length();
                int word1 = arr[i+1].length();
                if(word>word1)
                {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
