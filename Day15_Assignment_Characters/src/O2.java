import java.util.Arrays;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = new char[3];
        System.out.println("Please enter 3 characters ");
        for (int i = 0; i <3 ; i++)
        {
            arr[i] = in.next().charAt(0);
        }

        System.out.println("the OG Array is :"+ Arrays.toString(arr));
    }
}
