import java.util.Scanner;

public class O5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of terms :");
        int n = in.nextInt();
        for (int a = 0; a <n ; a++)
        {
            System.out.print(a%2 + " ");
        }
    }
}
// 0 1 0 1 0 1...
