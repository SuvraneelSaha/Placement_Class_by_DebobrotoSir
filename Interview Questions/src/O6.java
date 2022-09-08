import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);
        }
        Collections.sort(list);

        System.out.println(list);
    }
}
