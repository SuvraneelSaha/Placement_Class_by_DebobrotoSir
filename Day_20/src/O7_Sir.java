import java.util.Arrays;
import java.util.Scanner;

public class O7_Sir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = in.next();
        int n = s.length();

        char[] arr = new char[n];

        arr = s.toCharArray();

        for (int i = n-2; i >=0 ; i--)
        {
            for (int j = 0; j <=i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }    
        }

        System.out.println(Arrays.toString(arr));
    }
}
