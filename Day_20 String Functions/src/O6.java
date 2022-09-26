import java.util.Scanner;

public class O6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter n:");
        int n = in.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter Elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        String maxWord="";

        for (int i = 0; i < n; i++)
        {
            if(arr[i].length() > maxWord.length())
            {
                maxWord = arr[i];
            }
        }

        System.out.println(maxWord);
    }
}
